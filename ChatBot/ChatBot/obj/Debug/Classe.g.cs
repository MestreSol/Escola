﻿#pragma checksum "..\..\Classe.xaml" "{8829d00f-11b8-4213-878b-770e8597ac16}" "3005102EF17C5F7B81013387D1EB31B9B34F5DEB452CA9696F48017E5956B125"
//------------------------------------------------------------------------------
// <auto-generated>
//     O código foi gerado por uma ferramenta.
//     Versão de Tempo de Execução:4.0.30319.42000
//
//     As alterações ao arquivo poderão causar comportamento incorreto e serão perdidas se
//     o código for gerado novamente.
// </auto-generated>
//------------------------------------------------------------------------------

using ChatBot;
using System;
using System.Diagnostics;
using System.Windows;
using System.Windows.Automation;
using System.Windows.Controls;
using System.Windows.Controls.Primitives;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Ink;
using System.Windows.Input;
using System.Windows.Markup;
using System.Windows.Media;
using System.Windows.Media.Animation;
using System.Windows.Media.Effects;
using System.Windows.Media.Imaging;
using System.Windows.Media.Media3D;
using System.Windows.Media.TextFormatting;
using System.Windows.Navigation;
using System.Windows.Shapes;
using System.Windows.Shell;


namespace ChatBot {
    
    
    /// <summary>
    /// Classe
    /// </summary>
    public partial class Classe : System.Windows.Window, System.Windows.Markup.IComponentConnector {
        
        
        #line 9 "..\..\Classe.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.Label lbTituloInicial;
        
        #line default
        #line hidden
        
        
        #line 10 "..\..\Classe.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.Label lbConteudoUm;
        
        #line default
        #line hidden
        
        
        #line 11 "..\..\Classe.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.Label lbDois;
        
        #line default
        #line hidden
        
        
        #line 12 "..\..\Classe.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.Button btSim;
        
        #line default
        #line hidden
        
        
        #line 13 "..\..\Classe.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.Image Modelo;
        
        #line default
        #line hidden
        
        
        #line 20 "..\..\Classe.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.Button btProximo;
        
        #line default
        #line hidden
        
        
        #line 22 "..\..\Classe.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.Label nome;
        
        #line default
        #line hidden
        
        private bool _contentLoaded;
        
        /// <summary>
        /// InitializeComponent
        /// </summary>
        [System.Diagnostics.DebuggerNonUserCodeAttribute()]
        [System.CodeDom.Compiler.GeneratedCodeAttribute("PresentationBuildTasks", "4.0.0.0")]
        public void InitializeComponent() {
            if (_contentLoaded) {
                return;
            }
            _contentLoaded = true;
            System.Uri resourceLocater = new System.Uri("/ChatBot;component/classe.xaml", System.UriKind.Relative);
            
            #line 1 "..\..\Classe.xaml"
            System.Windows.Application.LoadComponent(this, resourceLocater);
            
            #line default
            #line hidden
        }
        
        [System.Diagnostics.DebuggerNonUserCodeAttribute()]
        [System.CodeDom.Compiler.GeneratedCodeAttribute("PresentationBuildTasks", "4.0.0.0")]
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Never)]
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Design", "CA1033:InterfaceMethodsShouldBeCallableByChildTypes")]
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Maintainability", "CA1502:AvoidExcessiveComplexity")]
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1800:DoNotCastUnnecessarily")]
        void System.Windows.Markup.IComponentConnector.Connect(int connectionId, object target) {
            switch (connectionId)
            {
            case 1:
            this.lbTituloInicial = ((System.Windows.Controls.Label)(target));
            return;
            case 2:
            this.lbConteudoUm = ((System.Windows.Controls.Label)(target));
            return;
            case 3:
            this.lbDois = ((System.Windows.Controls.Label)(target));
            return;
            case 4:
            this.btSim = ((System.Windows.Controls.Button)(target));
            
            #line 12 "..\..\Classe.xaml"
            this.btSim.Click += new System.Windows.RoutedEventHandler(this.btSim_Click);
            
            #line default
            #line hidden
            return;
            case 5:
            this.Modelo = ((System.Windows.Controls.Image)(target));
            return;
            case 6:
            
            #line 17 "..\..\Classe.xaml"
            ((System.Windows.Controls.Button)(target)).Click += new System.Windows.RoutedEventHandler(this.Anterior);
            
            #line default
            #line hidden
            return;
            case 7:
            this.btProximo = ((System.Windows.Controls.Button)(target));
            
            #line 20 "..\..\Classe.xaml"
            this.btProximo.Click += new System.Windows.RoutedEventHandler(this.Proximo);
            
            #line default
            #line hidden
            return;
            case 8:
            this.nome = ((System.Windows.Controls.Label)(target));
            return;
            }
            this._contentLoaded = true;
        }
    }
}
