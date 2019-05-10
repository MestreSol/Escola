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
		// e limitando os valores que poderão ser selecionados de acordo com seus imites
		SpinnerValueFactory<Integer> horaAtual = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 23, LocalTime.now().getHour());
		spHoraAtual.setValueFactory(horaAtual);		
		SpinnerValueFactory<Integer> minutoAtual = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 59, LocalTime.now().getMinute());
		spMinutoAtual.setValueFactory(minutoAtual);
		SpinnerValueFactory<Integer> segundoAtual = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 59, LocalTime.now().getSecond());
		spSegundoAtual.setValueFactory(segundoAtual);
		
		// Inicializa os controles Spinners spHoraInicial, spMinutoInicial e spSegundoInicial
		// limitando os valores que poderão ser selecionados de acordo com seus imites
		SpinnerValueFactory<Integer> horaInicial = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 23, 0);
		spHoraInicial.setValueFactory(horaInicial);		
		SpinnerValueFactory<Integer> minutoInicial = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 59, 0);
		spMinutoInicial.setValueFactory(minutoInicial);
		SpinnerValueFactory<Integer> segundoInicial = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 59, 0);
		spSegundoInicial.setValueFactory(segundoInicial);
		
		// Inicializa os controles Spinners spHoraFinal, spMinutoFinal e spSegundoFinal
		// limitando os valores que poderão ser selecionados de acordo com seus imites
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
		alert.setHeaderText("Padrão: Classe Instant");
		alert.setContentText( DataHoraAtualInstant.toString() );
		alert.showAndWait();
	}

	
	@FXML public void padraoLocalDateTime() {
	
		// Hora do Sistema Operacional no formato LocalDateTime
		LocalDateTime DataHoraAtualLocalDateTime = LocalDateTime.now();
		
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Data e hora atual do Sistema Operacional");
		alert.setHeaderText("Padrão: Classe LocalDateTime");
		alert.setContentText( DataHoraAtualLocalDateTime.toString() );
		alert.showAndWait();
	}	
	
	
	@FXML public void padraoLocalDate() {
		
		// Hora do Sistema Operacional no formato LocalDate
		LocalDate DataHoraAtualLocalDate = LocalDate.now();
		
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Data atual  do Sistema Operacional");
		alert.setHeaderText("Padrão: formato ISO-8601");		
		alert.setContentText( DataHoraAtualLocalDate.toString() );
		alert.showAndWait();		
	}

	
	@FXML public void padraoLocalTime() {
		
		// Hora do Sistema Operacional no formato LocalTime
		LocalTime DataHoraAtualLocalTime = LocalTime.now();
		
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Horário atual  do Sistema Operacional");
		alert.setHeaderText("Padrão: formato ISO-8601");		
		alert.setContentText( DataHoraAtualLocalTime.toString() );
		alert.showAndWait();				
	}

	
	@FXML public void dataFormatada() {
		
		// Formatações para a data lida a partir do controle DatePicker dpDataAtual
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatadorExtenso = DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy");

		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Data selecionada");
		alert.setHeaderText("Data formatada");		
		alert.setContentText( dpDataAtual.getValue().format(formatador) + "\n" + dpDataAtual.getValue().format(formatadorExtenso) );
		alert.showAndWait();				
	}

	
	@FXML public void dia() {
	
		// Obtém a data lida a partir do controle DatePicker dpDataAtual
		LocalDate diaAtual = LocalDate.parse(dpDataAtual.getValue().toString());

		// Extração do dia em diferentes formatos
		String diaDaSemana = String.valueOf( diaAtual.getDayOfWeek() );
		String diaDoMes = String.valueOf( diaAtual.getDayOfMonth() );
		String diaDoAno = String.valueOf( diaAtual.getDayOfYear() );
		
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Dia selecionado");
		alert.setHeaderText("Extração do dia");		
		alert.setContentText("Dia da semana: " + diaDaSemana + "\nDia do mês: " + diaDoMes + "\nDia do ano: " + diaDoAno);
		alert.showAndWait();				
	}

	
	@FXML public void mes() {
		
		// Obtém a data lida a partir do controle DatePicker dpDataAtual
		LocalDate mesAtual = LocalDate.parse(dpDataAtual.getValue().toString());

		// Extração do mês em diferentes formatos
		String mesExtenso = String.valueOf( mesAtual.getMonth() );
		String mes = String.valueOf( mesAtual.getMonthValue() );

		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Mês selecionado");
		alert.setHeaderText("Extração do mês");		
		alert.setContentText( "Mês: " + mes + "\nMês por extenso: " + mesExtenso );
		alert.showAndWait();				
	}

	
	@FXML public void ano() {
		
		// Obtém a data lida a partir do controle DatePicker dpDataAtual
		LocalDate anoAtual = LocalDate.parse(dpDataAtual.getValue().toString());

		// Extração do ano em diferentes formatos
		String ano = String.valueOf( anoAtual.getYear() );
		
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Ano selecionado");
		alert.setHeaderText("Extração do ano");		
		alert.setContentText( "Ano: " + ano );
		alert.showAndWait();				
	}

	
	@FXML public void horaFormatada() {

		// Obtém a hora, minuto e segundo lidos a partir dos controles Spinner spHoraAtual, spMinutoAtual e spSegundoAtual
		// formatados com dois dígitos
		String horaAtual = String.format("%02d", spHoraAtual.getValue());
	    String minutoAtual = String.format("%02d", spMinutoAtual.getValue());
	    String segundoAtual = String.format("%02d", spSegundoAtual.getValue());
	    // Monta uma String com o horário completo
	    String horarioAtualString = horaAtual + ":" + minutoAtual + ":" + segundoAtual;
		
	    // Converte o horário de String para LocalTime no formato HH:mm:ss
	    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("HH:mm:ss");
	    LocalTime horarioAtualFormatado = LocalTime.parse(horarioAtualString, formatador);
		
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Horário selecionada");
		alert.setHeaderText("Horário formatado");		
		alert.setContentText( horarioAtualFormatado.toString() );
		alert.showAndWait();				
	}

	
	@FXML public void hora() {

		// Obtém a hora, minuto e segundo lidos a partir dos controles Spinner spHoraAtual, spMinutoAtual e spSegundoAtual
		// formatados com dois dígitos
		String horaAtual = String.format("%02d", spHoraAtual.getValue());
	    String minutoAtual = String.format("%02d", spMinutoAtual.getValue());
	    String segundoAtual = String.format("%02d", spSegundoAtual.getValue());
        // Monta uma String com o horário completo
	    String horarioAtualString = horaAtual + ":" + minutoAtual + ":" + segundoAtual;
		
	    // Converte o horário de String para LocalTime no formato HH:mm:ss
	    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("HH:mm:ss");
	    LocalTime horarioAtualFormatado = LocalTime.parse(horarioAtualString, formatador);
		
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Hora selecionada");
		alert.setHeaderText("Extração da hora");		
		// Apresenta somente as horas formatada com dois dígitos
		alert.setContentText( "Hora: " + String.valueOf( String.format("%02d", horarioAtualFormatado.getHour() )));
		alert.showAndWait();				
	}

	
	@FXML public void minuto() {
	
		// Obtém a hora, minuto e segundo lidos a partir dos controles Spinner spHoraAtual, spMinutoAtual e spSegundoAtual
		// formatados com dois dígitos
		String horaAtual = String.format("%02d", spHoraAtual.getValue());
	    String minutoAtual = String.format("%02d", spMinutoAtual.getValue());
	    String segundoAtual = String.format("%02d", spSegundoAtual.getValue());
	    // Monta uma String com o horário completo
	    String horarioAtualString = horaAtual + ":" + minutoAtual + ":" + segundoAtual;
	
	    // Converte o horário de String para LocalTime no formato HH:mm:ss	    
	    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("HH:mm:ss");
	    LocalTime horarioAtualFormatado = LocalTime.parse(horarioAtualString, formatador);
		
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Minuto selecionado");
		alert.setHeaderText("Extração do minuto");		
		// Apresenta somente os minutos formatado com dois dígitos
		alert.setContentText( "Minuto: " + String.valueOf( String.format("%02d", horarioAtualFormatado.getMinute() )));
		alert.showAndWait();				
	}

	
	@FXML public void segundo() {
		
		// Obtém a hora, minuto e segundo lidos a partir dos controles Spinner spHoraAtual, spMinutoAtual e spSegundoAtual
		// formatados com dois dígitos
		String horaAtual = String.format("%02d", spHoraAtual.getValue());
	    String minutoAtual = String.format("%02d", spMinutoAtual.getValue());
	    String segundoAtual = String.format("%02d", spSegundoAtual.getValue());
	    // Monta uma String com o horário completo
	    String horarioAtualString = horaAtual + ":" + minutoAtual + ":" + segundoAtual;
		
	    // Converte o horário de String para LocalTime no formato HH:mm:ss
	    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("HH:mm:ss");
	    LocalTime horarioAtualFormatado = LocalTime.parse(horarioAtualString, formatador);

		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Segundo selecionado");
		alert.setHeaderText("Extração do segundo");		
		// Apresenta somente os segundos formatado com dois dígitos		
		alert.setContentText( "Segundo: " + String.valueOf( String.format("%02d", horarioAtualFormatado.getSecond() )));
		alert.showAndWait();				
	}

	
	@FXML public void diferencaDatas() {

		// Verifica se as datas selecionadas como inicio e fim estão coerentes
		if (dpDataFinal.getValue().isBefore(dpDataInicial.getValue())) {

			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Erro");
			alert.setHeaderText("Datas incoerentes");		
			alert.setContentText( "A data final não pode ser anterior a data inicial!");
			alert.showAndWait();				
		}else{

			// Obtém a data inicial e a data final lidas a partir dos controles DatePicker dpDataIncial e dpDataFinal
			// convertendo para LocalDate.
			// Esses objetos serão utilizados com a classe Period
			LocalDate dataInicial = LocalDate.parse(dpDataInicial.getValue().toString());
			LocalDate dataFinal = LocalDate.parse(dpDataFinal.getValue().toString());

			// Obtém separadamente o ano, mês e dia inical e final para utilizá-los em um objeto LocalDateTime  
			int anoInicial = dataInicial.getYear();
			int mesInicial = dataInicial.getMonthValue();
			int diaInicial = dataInicial.getDayOfMonth();			
			int anoFinal = dataFinal.getYear();
			int mesFinal = dataFinal.getMonthValue();
			int diaFinal = dataFinal.getDayOfMonth();			

			// Cria objetos LocalDateTime a partir do ano, mês e dia (selecionados nos DatePickers) e 
			// zeros para hora, minuto e segundos (uma vez que controles DatePickers não selecionam horários).
			// Esses objetos serão utilizados com a classe Duration
			LocalDateTime dataHoraInicial = LocalDateTime.of(anoInicial, mesInicial, diaInicial, 0,0,0);
			LocalDateTime dataHoraFinal = LocalDateTime.of(anoFinal, mesFinal, diaFinal, 0,0,0);

			// Calcula o período entre as datas (a partir de referências LocalDate)
			// Para extração dos anos, meses e dias
			Period periodoData = Period.between(dataInicial, dataFinal);

			// Calcula a duração entre as datas (a partir de referências LocalDateTime)
			// Para extração dos dias corridos
			Duration duracaoData = Duration.between(dataHoraInicial, dataHoraFinal);
			
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Periodo entre datas");
			alert.setHeaderText("Formato padrão Classe Period: " + periodoData);		
			alert.setContentText( "Diferença em anos: " + periodoData.getYears() +
					              "\nDiferença em meses: " + periodoData.getMonths() +
					              "\nDiferença em dias: " + periodoData.getDays() +
					              
			                      "\n\nDiferença em meses corridos: " + periodoData.toTotalMonths() +
			                      "\nDiferença em dias corridos: " + duracaoData.toDays());
			alert.showAndWait();				
		}
	}


	@FXML public void diferencaHorarios() {

		// Obtém a hora, minuto e segundo inicial lidos a partir dos controles Spinner spHoraInicial, spMinutoInicial e spSegundoInicial
		// formatados com dois dígitos		
		String horaInicial = String.format("%02d", spHoraInicial.getValue());
	    String minutoInicial = String.format("%02d", spMinutoInicial.getValue());
	    String segundoInicial = String.format("%02d", spSegundoInicial.getValue());
	    // Monta uma String com o horário inicial completo
	    String horarioInicialString = horaInicial + ":" + minutoInicial + ":" + segundoInicial;

		// Obtém a hora, minuto e segundo final lidos a partir dos controles Spinner spHoraFinal, spMinutoFinal e spSegundoFinal
		// formatados com dois dígitos		
		String horaFinal = String.format("%02d", spHoraFinal.getValue());
	    String minutoFinal = String.format("%02d", spMinutoFinal.getValue());
	    String segundoFinal = String.format("%02d", spSegundoFinal.getValue());
	    // Monta uma String com o horário final completo
	    String horarioFinalString = horaFinal + ":" + minutoFinal + ":" + segundoFinal;

		// Converte as Strings horarioInicialString e horarioFinalString para LocalTime
		LocalTime horarioInicial = LocalTime.parse(horarioInicialString);
		LocalTime horarioFinal = LocalTime.parse(horarioFinalString);

		// Verifica se os horários selecionados como inicio e fim estão coerentes	
		if (horarioFinal.isBefore(horarioInicial)) {

			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Erro");
			alert.setHeaderText("Horários incoerentes");		
			alert.setContentText( "O horário final não pode ser anterior ao horário inicial!");
			alert.showAndWait();				
		}else{

			// Calcula a duração entre os horários (a partir de referências LocalTime)
			Duration duracaoHorario = Duration.between(horarioInicial, horarioFinal);
	   
			// O método between da classe Duration calcula a diferença entre os horários em segundos.
			// A extração das horas, minutos, milisegundos e nanosegundos transcorridos é feita por métodos, mas,
			// a diferença em "hora relógio" deve ser calculada...
			
			// A partir da duração em segundos
		    long duracaoHorarioSegundosTotal = duracaoHorario.getSeconds();
		    // Dividindo por 3600 (1 hora = 60 minutos, 1 minuto = 60 segundos, 60 * 60 = 3600) obtém-se a quantidade de horas
		    long duracaoHorarioHoras = duracaoHorarioSegundosTotal / 3600;
		    // Se nessa divisão houver resto, basta dividir esse resto por 60 para obter a quantidade de minutos
		    long duracaoHorarioMinutos = (duracaoHorarioSegundosTotal % 3600) / 60;
		    // Os segundos são obtidos somando as horas e minutos (convertidos novamente para segundos) e subtraindo do total de segundos
		    long duracaoHorarioSegundos = duracaoHorarioSegundosTotal - ((duracaoHorarioHoras * 3600) + (duracaoHorarioMinutos * 60));
		    
		    // Tendo os valores da hora, minuto e segundos basta converte-los para String formatados para dois dígitos 
		    String duracaoHorarioHorasString = String.format("%02d", duracaoHorarioHoras);			
		    String duracaoHorarioMinutosString = String.format("%02d", duracaoHorarioMinutos);
		    String duracaoHorarioSegundosString = String.format("%02d", duracaoHorarioSegundos);
    
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Duração entre horários");
			alert.setHeaderText("Formato padrão Classe Duration: " + duracaoHorario);		
			alert.setContentText( 								  
					              "Diferença em horas: " + duracaoHorarioHorasString +
					              "\nDiferença em minutos: " + duracaoHorarioMinutosString +
					              "\nDiferença em segundos: " + duracaoHorarioSegundosString +
					              
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
