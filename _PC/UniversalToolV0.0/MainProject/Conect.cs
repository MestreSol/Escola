using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;

namespace MainProject
{
    class Conect
    {
        private String Nome;
        private String Porta;
        private String Senha;
        private String Usuario;

        public Conect() {
            try
            {

            }
            catch (Exception e) {
                MessageBox.Show("Nossos servidores estao temporariamente fora do ar\nTente novamente mais tarde");
                MessageBox.Show("Report:\n"+e);
            }
        }
    }
}
