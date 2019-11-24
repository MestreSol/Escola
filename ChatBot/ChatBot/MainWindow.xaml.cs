using ChatBot.DAO;
using MySql.Data.MySqlClient;
using System;
using System.Data.SqlClient;
using System.Windows;

namespace ChatBot
{
    /// <summary>
    /// Interação lógica para MainWindow.xam
    /// </summary>
    public partial class MainWindow : Window
    {
        
        private Usuario user = new Usuario();
        public static string ConnectionString = "Server=localhost;Database=chatbot;User Id=root;Password=";
        public MySqlConnection conectar = new MySqlConnection(ConnectionString);
        public MainWindow()
        {

            InitializeComponent();

            MySqlCommand command = conectar.CreateCommand();
            MySqlDataReader reader;
            command.CommandText = "SELECT * FROM Usuario where idUsuario = 1";
            conectar.Open();
            reader = command.ExecuteReader();
            if (reader.Read())
            {
                


                    user.ID = Convert.ToInt32(reader["idusuario"]);
                    user.nome = reader["nome"].ToString();
                    user.vida = Convert.ToDouble(reader["vida"]);
                    user.velocidadeDeLocomocao = Convert.ToDouble(reader["velocidadedelocomocao"]);
                    user.velocidadeDeAtaque = Convert.ToDouble(reader["velocidadedeataque"]);
                    user.Mana = Convert.ToDouble(reader["mana"]);
                    user.Gold = Convert.ToInt32(reader["gold"]);
                    user.regeneracaoDeVida = Convert.ToDouble(reader["regeneracaodevida"]);
                    user.danoBase = Convert.ToDouble(reader["danobase"]);
                    user.armadura = Convert.ToDouble(reader["armadura"]);
                    user.regeneracaoDeMana = Convert.ToDouble(reader["regeneracaodemana"]); 
                    user.tempoDeJogo = Convert.ToString(reader["tempodejogo"]);
                    conectar.Close();
                    Chat janela = new Chat(user);
                    janela.Show();
                    conectar.Close();
                    this.Close();



                
            }
            
            }
        

        public SqlCommand Query { get; }
        
        internal Usuario User { get => user; set => user = value; }

        private void btNão_Click(object sender, RoutedEventArgs e)
        {
            Nao n = new Nao();
            n.Show();
            this.Close();
        }

        private void btSim_Click(object sender, RoutedEventArgs e)
        {
            Sim s = new Sim();
            s.Show();
            this.Close();
        }
    }
}
