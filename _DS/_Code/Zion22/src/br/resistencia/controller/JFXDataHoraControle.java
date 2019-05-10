package br.resistencia.controller;

import java.net.URL;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.stage.Stage;

public class JFXDataHoraControle implements Initializable{

	// Atributo
	private Stage palcoDataHora;
	// Controles FXML
	@FXML private DatePicker dpDataAtual;
	@FXML private Spinner<Integer> spHoraAtual;
	@FXML private Spinner<Integer> spMinutoAtual;
	@FXML private Spinner<Integer> spSegundoAtual;
	@FXML private DatePicker dpDataInicial;
	@FXML private Spinner<Integer> spHoraInicial;
	@FXML private Spinner<Integer> spMinutoInicial;
	@FXML private Spinner<Integer> spSegundoInicial;
	@FXML private DatePicker dpDataFinal;
	@FXML private Spinner<Integer> spHoraFinal;
	@FXML private Spinner<Integer> spMinutoFinal;
	@FXML private Spinner<Integer> spSegundoFinal;
	@FXML private Button bInstant;
	@FXML private Button bLocalDateTime;
	@FXML private Button bLocalDate;
	@FXML private Button bLocalTime;		
	@FXML private Button bDataFormatada;	
	@FXML private Button bDia;
	@FXML private Button bMes;
	@FXML private Button bAno;
	@FXML private Button bHoraFormatada;
	@FXML private Button bHora;
	@FXML private Button bMinuto;
	@FXML private Button bSegundo;
	@FXML private Button bDiferencaDatas;
	@FXML Button bDiferencaHorarios;
	@FXML private Button bFechar;

	
	// Metodos de acesso ao atributo			
	public Stage getPalcoDataHora() {
		return palcoDataHora;
	}

	public void setPalcoDataHora(Stage palcoDataHora) {
		this.palcoDataHora = palcoDataHora;
	}


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		// Inicializa o controle DatePicker dpDataAtual com a data do Sistema Operacional
		dpDataAtual.setValue(LocalDate.now());
		
		// Inicializa os controles Spinners spHoraAtual, spMinutoAtual e spSegundoAtual, respectivamente,
		// com a hora, minuto e segundo do Sistema Operacional
		// e limitando os valores que poder�o ser selecionados de acordo com seus imites
		SpinnerValueFactory<Integer> horaAtual = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 23, LocalTime.now().getHour());
		spHoraAtual.setValueFactory(horaAtual);		
		SpinnerValueFactory<Integer> minutoAtual = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 59, LocalTime.now().getMinute());
		spMinutoAtual.setValueFactory(minutoAtual);
		SpinnerValueFactory<Integer> segundoAtual = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 59, LocalTime.now().getSecond());
		spSegundoAtual.setValueFactory(segundoAtual);
		
		// Inicializa os controles Spinners spHoraInicial, spMinutoInicial e spSegundoInicial
		// limitando os valores que poder�o ser selecionados de acordo com seus imites
		SpinnerValueFactory<Integer> horaInicial = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 23, 0);
		spHoraInicial.setValueFactory(horaInicial);		
		SpinnerValueFactory<Integer> minutoInicial = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 59, 0);
		spMinutoInicial.setValueFactory(minutoInicial);
		SpinnerValueFactory<Integer> segundoInicial = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 59, 0);
		spSegundoInicial.setValueFactory(segundoInicial);
		
		// Inicializa os controles Spinners spHoraFinal, spMinutoFinal e spSegundoFinal
		// limitando os valores que poder�o ser selecionados de acordo com seus imites
		SpinnerValueFactory<Integer> horaFinal = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 23, 0);
		spHoraFinal.setValueFactory(horaFinal);		
		SpinnerValueFactory<Integer> minutoFinal = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 59, 0);
		spMinutoFinal.setValueFactory(minutoFinal);
		SpinnerValueFactory<Integer> segundoFinal = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 59, 0);	
		spSegundoFinal.setValueFactory(segundoFinal);		
	}

	// Eventos dos controles FXML
	
	@FXML public void padraoInstant() {
		
		// Hora do Sistema Operacional no formato Instant
		Instant DataHoraAtualInstant = Instant.now();
			
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Data e hora atual do Sistema Operacional");
		alert.setHeaderText("Padr�o: Classe Instant");
		alert.setContentText( DataHoraAtualInstant.toString() );
		alert.showAndWait();
	}

	
	@FXML public void padraoLocalDateTime() {
	
		// Hora do Sistema Operacional no formato LocalDateTime
		LocalDateTime DataHoraAtualLocalDateTime = LocalDateTime.now();
		
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Data e hora atual do Sistema Operacional");
		alert.setHeaderText("Padr�o: Classe LocalDateTime");
		alert.setContentText( DataHoraAtualLocalDateTime.toString() );
		alert.showAndWait();
	}	
	
	
	@FXML public void padraoLocalDate() {
		
		// Hora do Sistema Operacional no formato LocalDate
		LocalDate DataHoraAtualLocalDate = LocalDate.now();
		
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Data atual  do Sistema Operacional");
		alert.setHeaderText("Padr�o: formato ISO-8601");		
		alert.setContentText( DataHoraAtualLocalDate.toString() );
		alert.showAndWait();		
	}

	
	@FXML public void padraoLocalTime() {
		
		// Hora do Sistema Operacional no formato LocalTime
		LocalTime DataHoraAtualLocalTime = LocalTime.now();
		
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Hor�rio atual  do Sistema Operacional");
		alert.setHeaderText("Padr�o: formato ISO-8601");		
		alert.setContentText( DataHoraAtualLocalTime.toString() );
		alert.showAndWait();				
	}

	
	@FXML public void dataFormatada() {
		
		// Formata��es para a data lida a partir do controle DatePicker dpDataAtual
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatadorExtenso = DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy");

		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Data selecionada");
		alert.setHeaderText("Data formatada");		
		alert.setContentText( dpDataAtual.getValue().format(formatador) + "\n" + dpDataAtual.getValue().format(formatadorExtenso) );
		alert.showAndWait();				
	}

	
	@FXML public void dia() {
	
		// Obt�m a data lida a partir do controle DatePicker dpDataAtual
		LocalDate diaAtual = LocalDate.parse(dpDataAtual.getValue().toString());

		// Extra��o do dia em diferentes formatos
		String diaDaSemana = String.valueOf( diaAtual.getDayOfWeek() );
		String diaDoMes = String.valueOf( diaAtual.getDayOfMonth() );
		String diaDoAno = String.valueOf( diaAtual.getDayOfYear() );
		
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Dia selecionado");
		alert.setHeaderText("Extra��o do dia");		
		alert.setContentText("Dia da semana: " + diaDaSemana + "\nDia do m�s: " + diaDoMes + "\nDia do ano: " + diaDoAno);
		alert.showAndWait();				
	}

	
	@FXML public void mes() {
		
		// Obt�m a data lida a partir do controle DatePicker dpDataAtual
		LocalDate mesAtual = LocalDate.parse(dpDataAtual.getValue().toString());

		// Extra��o do m�s em diferentes formatos
		String mesExtenso = String.valueOf( mesAtual.getMonth() );
		String mes = String.valueOf( mesAtual.getMonthValue() );

		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("M�s selecionado");
		alert.setHeaderText("Extra��o do m�s");		
		alert.setContentText( "M�s: " + mes + "\nM�s por extenso: " + mesExtenso );
		alert.showAndWait();				
	}

	
	@FXML public void ano() {
		
		// Obt�m a data lida a partir do controle DatePicker dpDataAtual
		LocalDate anoAtual = LocalDate.parse(dpDataAtual.getValue().toString());

		// Extra��o do ano em diferentes formatos
		String ano = String.valueOf( anoAtual.getYear() );
		
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Ano selecionado");
		alert.setHeaderText("Extra��o do ano");		
		alert.setContentText( "Ano: " + ano );
		alert.showAndWait();				
	}

	
	@FXML public void horaFormatada() {

		// Obt�m a hora, minuto e segundo lidos a partir dos controles Spinner spHoraAtual, spMinutoAtual e spSegundoAtual
		// formatados com dois d�gitos
		String horaAtual = String.format("%02d", spHoraAtual.getValue());
	    String minutoAtual = String.format("%02d", spMinutoAtual.getValue());
	    String segundoAtual = String.format("%02d", spSegundoAtual.getValue());
	    // Monta uma String com o hor�rio completo
	    String horarioAtualString = horaAtual + ":" + minutoAtual + ":" + segundoAtual;
		
	    // Converte o hor�rio de String para LocalTime no formato HH:mm:ss
	    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("HH:mm:ss");
	    LocalTime horarioAtualFormatado = LocalTime.parse(horarioAtualString, formatador);
		
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Hor�rio selecionada");
		alert.setHeaderText("Hor�rio formatado");		
		alert.setContentText( horarioAtualFormatado.toString() );
		alert.showAndWait();				
	}

	
	@FXML public void hora() {

		// Obt�m a hora, minuto e segundo lidos a partir dos controles Spinner spHoraAtual, spMinutoAtual e spSegundoAtual
		// formatados com dois d�gitos
		String horaAtual = String.format("%02d", spHoraAtual.getValue());
	    String minutoAtual = String.format("%02d", spMinutoAtual.getValue());
	    String segundoAtual = String.format("%02d", spSegundoAtual.getValue());
        // Monta uma String com o hor�rio completo
	    String horarioAtualString = horaAtual + ":" + minutoAtual + ":" + segundoAtual;
		
	    // Converte o hor�rio de String para LocalTime no formato HH:mm:ss
	    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("HH:mm:ss");
	    LocalTime horarioAtualFormatado = LocalTime.parse(horarioAtualString, formatador);
		
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Hora selecionada");
		alert.setHeaderText("Extra��o da hora");		
		// Apresenta somente as horas formatada com dois d�gitos
		alert.setContentText( "Hora: " + String.valueOf( String.format("%02d", horarioAtualFormatado.getHour() )));
		alert.showAndWait();				
	}

	
	@FXML public void minuto() {
	
		// Obt�m a hora, minuto e segundo lidos a partir dos controles Spinner spHoraAtual, spMinutoAtual e spSegundoAtual
		// formatados com dois d�gitos
		String horaAtual = String.format("%02d", spHoraAtual.getValue());
	    String minutoAtual = String.format("%02d", spMinutoAtual.getValue());
	    String segundoAtual = String.format("%02d", spSegundoAtual.getValue());
	    // Monta uma String com o hor�rio completo
	    String horarioAtualString = horaAtual + ":" + minutoAtual + ":" + segundoAtual;
	
	    // Converte o hor�rio de String para LocalTime no formato HH:mm:ss	    
	    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("HH:mm:ss");
	    LocalTime horarioAtualFormatado = LocalTime.parse(horarioAtualString, formatador);
		
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Minuto selecionado");
		alert.setHeaderText("Extra��o do minuto");		
		// Apresenta somente os minutos formatado com dois d�gitos
		alert.setContentText( "Minuto: " + String.valueOf( String.format("%02d", horarioAtualFormatado.getMinute() )));
		alert.showAndWait();				
	}

	
	@FXML public void segundo() {
		
		// Obt�m a hora, minuto e segundo lidos a partir dos controles Spinner spHoraAtual, spMinutoAtual e spSegundoAtual
		// formatados com dois d�gitos
		String horaAtual = String.format("%02d", spHoraAtual.getValue());
	    String minutoAtual = String.format("%02d", spMinutoAtual.getValue());
	    String segundoAtual = String.format("%02d", spSegundoAtual.getValue());
	    // Monta uma String com o hor�rio completo
	    String horarioAtualString = horaAtual + ":" + minutoAtual + ":" + segundoAtual;
		
	    // Converte o hor�rio de String para LocalTime no formato HH:mm:ss
	    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("HH:mm:ss");
	    LocalTime horarioAtualFormatado = LocalTime.parse(horarioAtualString, formatador);

		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Segundo selecionado");
		alert.setHeaderText("Extra��o do segundo");		
		// Apresenta somente os segundos formatado com dois d�gitos		
		alert.setContentText( "Segundo: " + String.valueOf( String.format("%02d", horarioAtualFormatado.getSecond() )));
		alert.showAndWait();				
	}

	
	@FXML public void diferencaDatas() {

		// Verifica se as datas selecionadas como inicio e fim est�o coerentes
		if (dpDataFinal.getValue().isBefore(dpDataInicial.getValue())) {

			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Erro");
			alert.setHeaderText("Datas incoerentes");		
			alert.setContentText( "A data final n�o pode ser anterior a data inicial!");
			alert.showAndWait();				
		}else{

			// Obt�m a data inicial e a data final lidas a partir dos controles DatePicker dpDataIncial e dpDataFinal
			// convertendo para LocalDate.
			// Esses objetos ser�o utilizados com a classe Period
			LocalDate dataInicial = LocalDate.parse(dpDataInicial.getValue().toString());
			LocalDate dataFinal = LocalDate.parse(dpDataFinal.getValue().toString());

			// Obt�m separadamente o ano, m�s e dia inical e final para utiliz�-los em um objeto LocalDateTime  
			int anoInicial = dataInicial.getYear();
			int mesInicial = dataInicial.getMonthValue();
			int diaInicial = dataInicial.getDayOfMonth();			
			int anoFinal = dataFinal.getYear();
			int mesFinal = dataFinal.getMonthValue();
			int diaFinal = dataFinal.getDayOfMonth();			

			// Cria objetos LocalDateTime a partir do ano, m�s e dia (selecionados nos DatePickers) e 
			// zeros para hora, minuto e segundos (uma vez que controles DatePickers n�o selecionam hor�rios).
			// Esses objetos ser�o utilizados com a classe Duration
			LocalDateTime dataHoraInicial = LocalDateTime.of(anoInicial, mesInicial, diaInicial, 0,0,0);
			LocalDateTime dataHoraFinal = LocalDateTime.of(anoFinal, mesFinal, diaFinal, 0,0,0);

			// Calcula o per�odo entre as datas (a partir de refer�ncias LocalDate)
			// Para extra��o dos anos, meses e dias
			Period periodoData = Period.between(dataInicial, dataFinal);

			// Calcula a dura��o entre as datas (a partir de refer�ncias LocalDateTime)
			// Para extra��o dos dias corridos
			Duration duracaoData = Duration.between(dataHoraInicial, dataHoraFinal);
			
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Periodo entre datas");
			alert.setHeaderText("Formato padr�o Classe Period: " + periodoData);		
			alert.setContentText( "Diferen�a em anos: " + periodoData.getYears() +
					              "\nDiferen�a em meses: " + periodoData.getMonths() +
					              "\nDiferen�a em dias: " + periodoData.getDays() +
					              
			                      "\n\nDiferen�a em meses corridos: " + periodoData.toTotalMonths() +
			                      "\nDiferen�a em dias corridos: " + duracaoData.toDays());
			alert.showAndWait();				
		}
	}


	@FXML public void diferencaHorarios() {

		// Obt�m a hora, minuto e segundo inicial lidos a partir dos controles Spinner spHoraInicial, spMinutoInicial e spSegundoInicial
		// formatados com dois d�gitos		
		String horaInicial = String.format("%02d", spHoraInicial.getValue());
	    String minutoInicial = String.format("%02d", spMinutoInicial.getValue());
	    String segundoInicial = String.format("%02d", spSegundoInicial.getValue());
	    // Monta uma String com o hor�rio inicial completo
	    String horarioInicialString = horaInicial + ":" + minutoInicial + ":" + segundoInicial;

		// Obt�m a hora, minuto e segundo final lidos a partir dos controles Spinner spHoraFinal, spMinutoFinal e spSegundoFinal
		// formatados com dois d�gitos		
		String horaFinal = String.format("%02d", spHoraFinal.getValue());
	    String minutoFinal = String.format("%02d", spMinutoFinal.getValue());
	    String segundoFinal = String.format("%02d", spSegundoFinal.getValue());
	    // Monta uma String com o hor�rio final completo
	    String horarioFinalString = horaFinal + ":" + minutoFinal + ":" + segundoFinal;

		// Converte as Strings horarioInicialString e horarioFinalString para LocalTime
		LocalTime horarioInicial = LocalTime.parse(horarioInicialString);
		LocalTime horarioFinal = LocalTime.parse(horarioFinalString);

		// Verifica se os hor�rios selecionados como inicio e fim est�o coerentes	
		if (horarioFinal.isBefore(horarioInicial)) {

			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Erro");
			alert.setHeaderText("Hor�rios incoerentes");		
			alert.setContentText( "O hor�rio final n�o pode ser anterior ao hor�rio inicial!");
			alert.showAndWait();				
		}else{

			// Calcula a dura��o entre os hor�rios (a partir de refer�ncias LocalTime)
			Duration duracaoHorario = Duration.between(horarioInicial, horarioFinal);
	   
			// O m�todo between da classe Duration calcula a diferen�a entre os hor�rios em segundos.
			// A extra��o das horas, minutos, milisegundos e nanosegundos transcorridos � feita por m�todos, mas,
			// a diferen�a em "hora rel�gio" deve ser calculada...
			
			// A partir da dura��o em segundos
		    long duracaoHorarioSegundosTotal = duracaoHorario.getSeconds();
		    // Dividindo por 3600 (1 hora = 60 minutos, 1 minuto = 60 segundos, 60 * 60 = 3600) obt�m-se a quantidade de horas
		    long duracaoHorarioHoras = duracaoHorarioSegundosTotal / 3600;
		    // Se nessa divis�o houver resto, basta dividir esse resto por 60 para obter a quantidade de minutos
		    long duracaoHorarioMinutos = (duracaoHorarioSegundosTotal % 3600) / 60;
		    // Os segundos s�o obtidos somando as horas e minutos (convertidos novamente para segundos) e subtraindo do total de segundos
		    long duracaoHorarioSegundos = duracaoHorarioSegundosTotal - ((duracaoHorarioHoras * 3600) + (duracaoHorarioMinutos * 60));
		    
		    // Tendo os valores da hora, minuto e segundos basta converte-los para String formatados para dois d�gitos 
		    String duracaoHorarioHorasString = String.format("%02d", duracaoHorarioHoras);			
		    String duracaoHorarioMinutosString = String.format("%02d", duracaoHorarioMinutos);
		    String duracaoHorarioSegundosString = String.format("%02d", duracaoHorarioSegundos);
    
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Dura��o entre hor�rios");
			alert.setHeaderText("Formato padr�o Classe Duration: " + duracaoHorario);		
			alert.setContentText( 								  
					              "Diferen�a em horas: " + duracaoHorarioHorasString +
					              "\nDiferen�a em minutos: " + duracaoHorarioMinutosString +
					              "\nDiferen�a em segundos: " + duracaoHorarioSegundosString +
					              
					              "\n\nTempo transcorrido em horas: " + duracaoHorario.toHours() +
					              "\nTempo transcorrido em minutos: " + duracaoHorario.toMinutes() +
					              "\nTempo transcorrido em segundo: " + duracaoHorario.getSeconds() +
					              "\nTempo transcorrido em milisegundo: " + duracaoHorario.toMillis() +
					              "\nTempo transcorrido em nanosegundo: " + duracaoHorario.toNanos());
			alert.showAndWait();				
		}
	}

	
	@FXML public void fechar() {
		this.getPalcoDataHora().close();
	}







	
	
	
}
