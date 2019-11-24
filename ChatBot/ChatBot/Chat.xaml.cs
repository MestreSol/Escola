using ChatBot.DAO;
using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Shapes;

namespace ChatBot
{
    /// <summary>
    /// Lógica interna para Chat.xaml
    /// </summary>
    public partial class Chat : Window
    {
        public static string ConnectionString = "Server=localhost;Database=chatbot;User Id=root;Password=";
        public MySqlConnection conectar = new MySqlConnection(ConnectionString);
        Usuario usuario = new Usuario();
        public int i = 1;
        public String Classe;
        public int capitulo = 0;
        public Chat()
        {
            InitializeComponent();
        }
        public Chat(Usuario user)
        {
            InitializeComponent();
            
            usuario = user;
            if (user.nome == "Null")
            {
                ChatBox.Items.Add("---> Mestre ---> Como deverei lhe chamar, caro jogador");
                i = 1;
            }
            else {
                i = 2;
                ChatBox.Items.Add("---> Mestre ---> Em que captulo nos paramos?");
            }
        }
        private void BotMensagem(int a) {
            switch (a) {
                case 1:
                    ChatBox.Items.Add("---> Mestre ---> Voce acorda...");
                    ChatBox.Items.Add("---> Mestre ---> Ha um grande vaziu em sua volta");
                    ChatBox.Items.Add("---> Mestre ---> A unica coisa que você sente é um vento vindo do leste");
                    ChatBox.Items.Add("---> Ação ---> 1 - Aguardar | 2 - Seguir vento");
                    i = 3;
                    break;
                case 2:
                    ChatBox.Items.Add("---> Mestre ---> Voce aguarda por algumas horas e alguns barulos começão a vir do leste");
                    ChatBox.Items.Add("---> Ação ---> 1 - Seguir");
                    i = 4;
                    break;
                case 3:
                    ChatBox.Items.Add("---> Mestre ---> Voce anda em direção ao leste");
                    ChatBox.Items.Add("---> Mestre ---> Ao longe voce avista uma abertura no local escuro em que voce esta");
                    ChatBox.Items.Add("---> Mestre ---> Do lado de forá a um Aaralocra");
                    ChatBox.Items.Add("---> Mestre ---> Ele esta de guarda");
                    ChatBox.Items.Add("---> Mestre ---> Protegendo a unica saida do local que voce esta");
                    ChatBox.Items.Add("---> Ação ---> 1 - Enganar | 2 - Saltar e batalhar | 3 - Atacar furtivamente");
                    i = 5;
                    break;
                case 7:
                    ChatBox.Items.Add("---> Mestre --->  Voce ataca ");
                    ChatBox.Items.Add("---> Mestre --->  Porem");
                    ChatBox.Items.Add("---> Mestre --->  Uma força misteriosa lhe impede disso, e lhe atingem");
                    ChatBox.Items.Add("---> Mestre --->  Na regiao do estomago");
                    ChatBox.Items.Add("---> Mestre --->  Seu sangue comessa a jorar");
                    ChatBox.Items.Add("---> Mestre --->  Voce cai no chao");
                    ChatBox.Items.Add("---> Mestre --->  Agonizando de dor");
                    ChatBox.Items.Add("---> Mestre --->  Voce morre");
                    ChatBox.Items.Add("---> Mestre --->  reinicie o chat para comessar outro jogo");
                    break;
                case 8:
                    ChatBox.Items.Add("---> Mestre --->  Voce ataca ");
                    ChatBox.Items.Add("---> Mestre --->  Porem");
                    ChatBox.Items.Add("---> Mestre --->  Uma força misteriosa lhe impede disso, e lhe atingem");
                    ChatBox.Items.Add("---> Mestre --->  Na regiao do estomago");
                    ChatBox.Items.Add("---> Mestre --->  Seu sangue comessa a jorar");
                    ChatBox.Items.Add("---> Mestre --->  Voce cai no chao");
                    ChatBox.Items.Add("---> Mestre --->  Agonizando de dor");
                    ChatBox.Items.Add("---> Mestre --->  Voce morre");
                    ChatBox.Items.Add("---> Mestre --->  reinicie o chat para comessar outro jogo");
                    break;
                case 9:
                    ChatBox.Items.Add("---> Mestre --->  Voce ataca ");
                    ChatBox.Items.Add("---> Mestre --->  Porem");
                    ChatBox.Items.Add("---> Mestre --->  Uma força misteriosa lhe impede disso, e lhe atingem");
                    ChatBox.Items.Add("---> Mestre --->  Na regiao do estomago");
                    ChatBox.Items.Add("---> Mestre --->  Seu sangue comessa a jorar");
                    ChatBox.Items.Add("---> Mestre --->  Voce cai no chao");
                    ChatBox.Items.Add("---> Mestre --->  Agonizando de dor");
                    ChatBox.Items.Add("---> Mestre --->  Voce morre");
                    ChatBox.Items.Add("---> Mestre --->  Juntamente com seu inimigo");
                    ChatBox.Items.Add("---> Mestre --->  Que morreu sem saber o que lhe atingiu");
                    ChatBox.Items.Add("---> Mestre --->  reinicie o chat para comessar outro jogo");
                    break;
                case 10:
                    ChatBox.Items.Add("---> Mestre --->  Voce morre");
                    break;

                case 5:
                    ChatBox.Items.Add("---> Mestre --->  Voce salta e seu inimigo percebe");
                    ChatBox.Items.Add("---> Mestre --->  Antes que voce reaja, ele lhe atinge com uma espada no pescoso");
                    break;
                case 6:
                    ChatBox.Items.Add("---> Mestre --->  Voce TENTA ser furtivo");
                    ChatBox.Items.Add("---> Mestre --->  Ele POR ALGUM MOTIVO");
                    ChatBox.Items.Add("---> Mestre --->  Ele percebe e lhe ataca pela parete");
                    ChatBox.Items.Add("---> Sistema ---> Box Colided error...");
                    break;
            }
        }
        private void button_Click(object sender, RoutedEventArgs e)
        {
            String m = mensagem.Text;
            switch (i) {
                case 1:
                    
                    Conexao con = new Conexao();
                    String Insert = "UPDATE `chatbot`.`usuario` SET `Nome`=@Nome WHERE `idUsuario`='1'";
                    MySqlCommand inserir = new MySqlCommand(Insert, con.conectar);
                    inserir.Parameters.AddWithValue("@Nome", m);
                    inserir.ExecuteReader();
                    ChatBox.Items.Add("---> Eu --->" + m);
                    BotMensagem(1);
                    break;
                case 2:
                    ChatBox.Items.Add("---> Eu --->" + m);
                    if (m == "1")
                    {
                        capitulo = 1;
                        ChatBox.Items.Add("---> Mestre --->  Ok Vamos comessar");
                        BotMensagem(1);
                        i = 3;
                    }
                    else {
                        ChatBox.Items.Add("---> Mestre ---> Este capitulo não existe...");
                    }
                    break;
                case 3:
                    if (m == "1") { ChatBox.Items.Add("---> Eu --->" + m); BotMensagem(2); } else if (m == "2") { ChatBox.Items.Add("---> Eu --->" + m); BotMensagem(3); } else { ChatBox.Items.Add("---> Sistema ---> Ação invalida"); }
                    break;
                case 4:
                    if (m == "1")
                    {
                        ChatBox.Items.Add("---> Eu --->" + m); BotMensagem(3);
                    }
                    else { ChatBox.Items.Add("---> Sistema ---> Ação invalida"); }
                    break;
                case 5:
                    MySqlCommand command = conectar.CreateCommand();
                    MySqlDataReader reader;
                    command.CommandText = "SELECT Classe FROM Usuario where idUsuario = 1";
                    conectar.Open();
                    reader = command.ExecuteReader();
                    if (reader.Read())
                    {
                        Classe = reader["Classe"].ToString();
                    }

                     if (m == "1")
                    { 
                        ChatBox.Items.Add("---> Eu --->" + m);
                        if (Classe == "4")
                        {
                            Random rolagem = new Random();
                            int valor = rolagem.Next(5, 20);
                            ChatBox.Items.Add("---> Sistema ---> Resultado da rolagem:" + valor);
                            if (valor >= 5 && valor <= 10)
                            {
                                BotMensagem(7);
                            }
                            else if (valor >= 15 && valor <= 17)
                            {
                                BotMensagem(8);
                            }
                            else
                            {
                                BotMensagem(9);
                            }
                        }
                        else
                        {
                            Random rolagem = new Random();
                            int valor = rolagem.Next(0, 20);
                            ChatBox.Items.Add("---> Sistema ---> Resultado da rolagem:" + valor); BotMensagem(7);
                            if (valor < 5)
                            {
                                BotMensagem(10);
                            }
                            else if (valor >= 5 && valor <= 10)
                            {
                                BotMensagem(7);
                            }
                            else if (valor >= 15 && valor <= 17)
                            {
                                BotMensagem(8);
                            }
                            else
                            {
                                BotMensagem(9);
                            }
                        }
                    } 
                    else if (m == "2") 
                    { 
                        ChatBox.Items.Add("---> Eu --->" + m); BotMensagem(5); 
                    } 
                    else if (m == "3")
                    {
                        ChatBox.Items.Add("---> Eu --->" + m); BotMensagem(6);
                       
                    }
                    break;
            }
        }

        private void Button_Click_1(object sender, RoutedEventArgs e)
        {
            Erro erro = new Erro();
            erro.Show();
        }

        private void Button_Click_2(object sender, RoutedEventArgs e)
        {
            Erro erro = new Erro();
            erro.Show();
        }

        private void Fechar(object sender, RoutedEventArgs e)
        {
            Environment.Exit(0);
        }
    }
}
