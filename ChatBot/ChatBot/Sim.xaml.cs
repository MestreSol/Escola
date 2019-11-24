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
    /// Lógica interna para Sim.xaml
    /// </summary>
    public partial class Sim : Window
    {
        public int i = 1;
        public Sim()
        {
            InitializeComponent();
            Imagem(i);
            
        }
        public void Imagem(int numero) {
            switch (numero) {
                case 1:
                    nome.Content = "Cosmico";
                    Classe.Source = new BitmapImage(new Uri("https://pa1.narvii.com/7191/aece4ceeab7c07272446db7d76ee35fb261e6734r1-320-320_00.gif"));
                    break;
                case 2:
                    nome.Content = "Demonio";
                    Classe.Source = new BitmapImage( new Uri("https://i.pinimg.com/originals/fa/e5/0b/fae50b6f691bcaa029fa027540d27f32.gif"));
                    break;
                case 3:
                    nome.Content = "Elemental";
                    Classe.Source = new BitmapImage(new Uri("https://pa1.narvii.com/6741/593b5affa6a3ac0416a116852c9914dd0f9f7f59_hq.gif"));
                    break;
                case 4:
                    nome.Content = "Humano";
                    Classe.Source = new BitmapImage(new Uri("https://i.pinimg.com/originals/24/66/77/246677d5de6797be054902d8061dfded.gif"));
                    break;
                case 5:
                    nome.Content = "Robo";
                    Classe.Source = new BitmapImage(new Uri("https://pbs.twimg.com/tweet_video_thumb/CsQUzr0XgAEmHFB.jpg"));
                    break;
                default:
                    
                    break;
            }
        }
        private void Proximo(object sender, RoutedEventArgs e)
        {
            if (i < 5)
            {
                i++;
            }
            else {
                i = 1;
            }
            Imagem(i);
        }
        private void Anterior(object sender, RoutedEventArgs e)
        {
            i--;
            if (i > 1)
            {
                i--;
            }
            else
            {
                i = 5;
            }
            Imagem(i);
        }

        private void btSim_Click(object sender, RoutedEventArgs e)
        {
            switch (i) {
                case 1:
                    try
                    {

                        Conexao con = new Conexao();
                        String Insert = "INSERT INTO `chatbot`.`usuario` (`idUsuario`, `Nome`, `Vida`, `velocidadeDeLocomocao`, `velocidadeDeAtaque`, `Mana`, `Gold`, `regeneracaoDeVida`, `danoBase`, `armadura`, `regeneracaoDeMana`, `TempoDeJogo`,`Raca`) VALUES ('1', 'Null', '150', '1.5', '0.5', '150', '0', '1.5', '4', '15', '0.5', '0','1')";
                        MySqlCommand inserir = new MySqlCommand(Insert, con.conectar);
                        inserir.ExecuteReader();
                        Classe janela = new Classe();
                        janela.Show();
                        this.Close();
                        break;

                    }
                    catch (MySqlException E) {
                        Tratamento erro = new Tratamento(E.ToString(),2);
                        Environment.Exit(0);
                        break;
                    }

                case 2:
                    try
                    {
                        Conexao con = new Conexao();
                        String Insert = "INSERT INTO `chatbot`.`usuario` (`idUsuario`, `Nome`, `Vida`, `velocidadeDeLocomocao`, `velocidadeDeAtaque`, `Mana`, `Gold`, `regeneracaoDeVida`, `danoBase`, `armadura`, `regeneracaoDeMana`, `TempoDeJogo`,`Raca`) VALUES ('1', 'Null', '150', '1.5', '0.5', '150', '0', '1.5', '4.0', '15', '0.5', '0','2')";
                        MySqlCommand inserir = new MySqlCommand(Insert, con.conectar);
                        inserir.ExecuteReader();
                        Classe janela = new Classe();
                        janela.Show();
                        this.Close();
                        break;
                    }
                    catch (MySqlException E)
                    {
                        Tratamento erro = new Tratamento(E.ToString(), 2);
                        Environment.Exit(0);
                        break;
                    }
                    
                case 3:
                    try
                    {
                        Conexao con = new Conexao();
                        String Insert = "INSERT INTO `chatbot`.`usuario` (`idUsuario`, `Nome`, `Vida`, `velocidadeDeLocomocao`, `velocidadeDeAtaque`, `Mana`, `Gold`, `regeneracaoDeVida`, `danoBase`, `armadura`, `regeneracaoDeMana`, `TempoDeJogo`,`Raca`) VALUES ('1', 'Null', '100', '1.0', '1.0', '100', '0', '1.5', '6', '15', '0.5', '0','3')";
                        MySqlCommand inserir = new MySqlCommand(Insert, con.conectar);
                        inserir.ExecuteReader();
                        Classe janela = new Classe();
                        janela.Show();
                        this.Close();
                        break;
                    }
                    catch (MySqlException E)
                    {
                        Tratamento erro = new Tratamento(E.ToString(), 2);
                        Environment.Exit(0);
                        break;
                    }
                    
                case 4:
                    try
                    {
                        Conexao con = new Conexao();
                        String Insert = "INSERT INTO `chatbot`.`usuario` (`idUsuario`, `Nome`, `Vida`, `velocidadeDeLocomocao`, `velocidadeDeAtaque`, `Mana`, `Gold`, `regeneracaoDeVida`, `danoBase`, `armadura`, `regeneracaoDeMana`, `TempoDeJogo`,`Raca`) VALUES ('1', 'Null', '150', '1.5', '0.5', '150', '0', '1.5', '4', '15', '0.5', '0','4')";
                        MySqlCommand inserir = new MySqlCommand(Insert, con.conectar);
                        inserir.ExecuteReader();
                        Classe janela = new Classe();
                        janela.Show();
                        this.Close();
                        break;
                    }
                    catch (MySqlException E)
                    {
                        Tratamento erro = new Tratamento(E.ToString(), 2);
                        Environment.Exit(0);
                        break;
                    }
                case 5:
                    try
                    {
                        Conexao con = new Conexao();
                        String Insert = "INSERT INTO `chatbot`.`usuario` (`idUsuario`, `Nome`, `Vida`, `velocidadeDeLocomocao`, `velocidadeDeAtaque`, `Mana`, `Gold`, `regeneracaoDeVida`, `danoBase`, `armadura`, `regeneracaoDeMana`, `TempoDeJogo`,`Raca`) VALUES ('1', 'Null', '150', '1.5', '0.5', '150', '0', '1.5', '4', '15', '0.5', '0','5')";
                        MySqlCommand inserir = new MySqlCommand(Insert, con.conectar);
                        inserir.ExecuteReader();
                        Classe janela = new Classe();
                        janela.Show();
                        this.Close();
                        break;
                    }
                    catch (MySqlException E)
                    {
                        Tratamento erro = new Tratamento(E.ToString(), 2);
                        Environment.Exit(0);
                        break;
                    }
            }
        }
    }
}
