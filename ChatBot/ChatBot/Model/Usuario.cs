using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ChatBot
{
    public partial class Usuario
    {
        public int ID;
        public String nome;
        public double vida;
        public double velocidadeDeLocomocao;
        public double velocidadeDeAtaque;
        public double Mana;
        public int Gold;
        public double regeneracaoDeVida;
        public double danoBase;
        public double armadura;
        public double regeneracaoDeMana;
        public String tempoDeJogo;
        public Usuario() { }
        public Usuario(int iD, String Nome, double Vida, double VeloL, double VeloA, double mana, int gold, double RegVida, double Db, double Arm, double RegMana, String tempoDeJogo) {
            ID = iD;
            nome = Nome;
            vida = Vida;
            velocidadeDeLocomocao = VeloL;
            velocidadeDeAtaque = VeloA;
            Mana = mana;
            Gold = gold;
            regeneracaoDeVida = RegVida;
            danoBase = Db;
            armadura = Arm;
            regeneracaoDeMana = RegMana;
            this.tempoDeJogo = tempoDeJogo;
        }

    }
}
