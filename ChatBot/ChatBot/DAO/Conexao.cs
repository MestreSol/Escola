using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Data;
using System.Data.Sql;
using System.Data.SqlClient;
using System.Windows;
using MySql.Data.MySqlClient;

namespace ChatBot.DAO
{
    class Conexao
    {
        public static string ConnectionString = "Server=localhost;Database=chatbot;User Id=root;Password=";
        public MySqlConnection conectar = new MySqlConnection(ConnectionString);
        public Conexao() {
            try
            {
                conectar.Open();
            }
            catch (Exception E) {
                MessageBox.Show("Infelismente o banco de dados do nosso sistema não foi encontrado, volte novamente mais tarde");
                Tratamento tratamento = new Tratamento(E.ToString(), 1);
                MessageBox.Show(E.ToString());
                Environment.Exit(0);
            }
            }
    }
}
