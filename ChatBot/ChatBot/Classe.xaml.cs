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
    /// Lógica interna para Classe.xaml
    /// </summary>
    public partial class Classe : Window
    {
        private int i = 1;
        public Classe()
        {
            InitializeComponent();
            Imagem(i);
        }

        public void Imagem(int numero)
        {
            switch (numero)
            {
                case 1:
                    nome.Content = "Arqueiro";
                    Modelo.Source = new BitmapImage(new Uri("https://i.pinimg.com/originals/2f/5f/bd/2f5fbd8a0b004c880d9ac25a45279fc5.png"));
                    break;
                case 2:
                    nome.Content = "Cavaleiro";
                    Modelo.Source = new BitmapImage(new Uri("https://i.pinimg.com/originals/4e/40/6b/4e406b34310631f807e9ab3750eafe17.png"));
                    break;
                case 3:
                    nome.Content = "Ninja";
                    Modelo.Source = new BitmapImage(new Uri("https://i.pinimg.com/originals/84/df/0e/84df0e89dba5eac14ed3e46518fcaad3.png"));
                    break;
                case 4:
                    nome.Content = "Mago";
                    Modelo.Source = new BitmapImage(new Uri("https://i.pinimg.com/236x/2d/6f/a8/2d6fa81a17e21e6396082567d0a01cad--character-art-character-inspiration.jpg"));
                    break;
                case 5:
                    nome.Content = "Paladino da morte";
                    Modelo.Source = new BitmapImage(new Uri("https://mir-s3-cdn-cf.behance.net/projects/404/9658045.547dc18de5b4c.png"));
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
            else
            {
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
            switch (i)
            {
                case 1:
                    try
                    {

                        Conexao con = new Conexao();
                        String Insert = "UPDATE `chatbot`.`usuario` SET `Classe`='1' WHERE `idUsuario`='1'";
                        MySqlCommand inserir = new MySqlCommand(Insert, con.conectar);
                        inserir.ExecuteReader();
                        MySqlCommand Consulta = new MySqlCommand();
                        Consulta.Connection = con.conectar;
                        Consulta.CommandText = "SELECT * FROM Usuario WHERE idUsuario = 1";
                        MySqlDataReader Resultado = Consulta.ExecuteReader();
                        if (Resultado.Read()) {
                           
                                
                                Usuario usuario = new Usuario(Convert.ToInt32(Resultado["idUsuario"]), Convert.ToString(Resultado["nome"]), Convert.ToDouble(Resultado["Vida"]), Convert.ToDouble(Resultado["velocidadeDeLocomocao"]), Convert.ToDouble(Resultado["velocidadeDeAtaque"]), Convert.ToDouble(Resultado["Mana"]), Convert.ToInt32(Resultado["Gold"]), Convert.ToDouble(Resultado["regeneracaoDeVida"]), Convert.ToDouble(Resultado["danoBase"]), Convert.ToDouble(Resultado["armadura"]), Convert.ToDouble(Resultado["regeneracaoDeMana"]), Convert.ToString(Resultado["TempoDeJogo"]));

                        }
                        
                        Chat janela = new Chat();
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

                case 2:
                    try
                    {
                        Conexao con = new Conexao();
                        String Insert = "UPDATE `chatbot`.`usuario` SET `Classe`='2' WHERE `idUsuario`='1'";
                        MySqlCommand inserir = new MySqlCommand(Insert, con.conectar);
                        inserir.ExecuteReader();
                        MySqlCommand Consulta = new MySqlCommand();
                        Consulta.Connection = con.conectar;
                        Consulta.CommandText = "SELECT * FROM Usuario WHERE idUsuario = 1";
                        MySqlDataReader Resultado = Consulta.ExecuteReader();
                        if (Resultado.Read())
                        {
                            

                                Usuario usuario = new Usuario(Convert.ToInt32(Resultado["idUsuario"]), Convert.ToString(Resultado["nome"]), Convert.ToDouble(Resultado["Vida"]), Convert.ToDouble(Resultado["velocidadeDeLocomocao"]), Convert.ToDouble(Resultado["velocidadeDeAtaque"]), Convert.ToDouble(Resultado["Mana"]), Convert.ToInt32(Resultado["Gold"]), Convert.ToDouble(Resultado["regeneracaoDeVida"]), Convert.ToDouble(Resultado["danoBase"]), Convert.ToDouble(Resultado["armadura"]), Convert.ToDouble(Resultado["regeneracaoDeMana"]), Convert.ToString(Resultado["TempoDeJogo"]));
                            
                        }

                        Chat janela = new Chat();
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
                        String Insert = "UPDATE `chatbot`.`usuario` SET `Classe`='3' WHERE `idUsuario`='1'";
                        MySqlCommand inserir = new MySqlCommand(Insert, con.conectar);
                        inserir.ExecuteReader();
                        MySqlCommand Consulta = new MySqlCommand();
                        Consulta.Connection = con.conectar;
                        Consulta.CommandText = "SELECT * FROM Usuario WHERE idUsuario = 1";
                        MySqlDataReader Resultado = Consulta.ExecuteReader();
                        if (Resultado.Read())
                        {
                            
                                Usuario usuario = new Usuario(Convert.ToInt32(Resultado["idUsuario"]), Convert.ToString(Resultado["nome"]), Convert.ToDouble(Resultado["Vida"]), Convert.ToDouble(Resultado["velocidadeDeLocomocao"]), Convert.ToDouble(Resultado["velocidadeDeAtaque"]), Convert.ToDouble(Resultado["Mana"]), Convert.ToInt32(Resultado["Gold"]), Convert.ToDouble(Resultado["regeneracaoDeVida"]), Convert.ToDouble(Resultado["danoBase"]), Convert.ToDouble(Resultado["armadura"]), Convert.ToDouble(Resultado["regeneracaoDeMana"]), Convert.ToString(Resultado["TempoDeJogo"]));
                            
                        }

                        Chat janela = new Chat();
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
                        String Insert = "UPDATE `chatbot`.`usuario` SET `Classe`='4' WHERE `idUsuario`='1'";
                        MySqlCommand inserir = new MySqlCommand(Insert, con.conectar);
                        inserir.ExecuteReader();
                        MySqlCommand Consulta = new MySqlCommand();
                        Consulta.Connection = con.conectar;
                        Consulta.CommandText = "SELECT * FROM Usuario WHERE idUsuario = 1";
                        MySqlDataReader Resultado = Consulta.ExecuteReader();
                        if (Resultado.Read())
                        {
                            
                                Usuario usuario = new Usuario(Convert.ToInt32(Resultado["idUsuario"]), Convert.ToString(Resultado["nome"]), Convert.ToDouble(Resultado["Vida"]), Convert.ToDouble(Resultado["velocidadeDeLocomocao"]), Convert.ToDouble(Resultado["velocidadeDeAtaque"]), Convert.ToDouble(Resultado["Mana"]), Convert.ToInt32(Resultado["Gold"]), Convert.ToDouble(Resultado["regeneracaoDeVida"]), Convert.ToDouble(Resultado["danoBase"]), Convert.ToDouble(Resultado["armadura"]), Convert.ToDouble(Resultado["regeneracaoDeMana"]), Convert.ToString(Resultado["TempoDeJogo"]));
                           
                        }

                        Chat janela = new Chat();
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
                        String Insert = "UPDATE `chatbot`.`usuario` SET `Classe`='5' WHERE `idUsuario`='1'";
                        MySqlCommand inserir = new MySqlCommand(Insert, con.conectar);
                        inserir.ExecuteReader();
                        MySqlCommand Consulta = new MySqlCommand();
                        Consulta.Connection = con.conectar;
                        Consulta.CommandText = "SELECT * FROM Usuario WHERE idUsuario = 1";
                        MySqlDataReader Resultado = Consulta.ExecuteReader();
                        if (Resultado.Read())
                        {
                            

                                Usuario usuario = new Usuario(Convert.ToInt32(Resultado["idUsuario"]), Convert.ToString(Resultado["nome"]), Convert.ToDouble(Resultado["Vida"]), Convert.ToDouble(Resultado["velocidadeDeLocomocao"]), Convert.ToDouble(Resultado["velocidadeDeAtaque"]), Convert.ToDouble(Resultado["Mana"]), Convert.ToInt32(Resultado["Gold"]), Convert.ToDouble(Resultado["regeneracaoDeVida"]), Convert.ToDouble(Resultado["danoBase"]), Convert.ToDouble(Resultado["armadura"]), Convert.ToDouble(Resultado["regeneracaoDeMana"]), Convert.ToString(Resultado["TempoDeJogo"]));
                           
                        }

                        Chat janela = new Chat();
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
