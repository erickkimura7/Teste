import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Teste {

	private static String nome = "nf-field-1";
	private static String sobrenome = "nf-field-5";
	private static String telefone = "nf-field-6";
	private static String email = "nf-field-2";
	private static String message = "nf-field-3";
	private static String button = "nf-field-4";
	private static String certo = "nf-response-msg";
	private static String erro = "nf-error-msg nf-error-field-errors";
	

	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\erick\\Desktop\\lib\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost/formulario_teste/");
		// id="nf-field-1"
		for (int i = 0; i < 3; i++) {
			
			driver.findElement(By.id(nome)).sendKeys("ola");
			driver.findElement(By.id(sobrenome)).sendKeys("ola");
			driver.findElement(By.id(telefone)).sendKeys("ola");
			driver.findElement(By.id(email)).sendKeys("ola@gmail.com");
			driver.findElement(By.id(message)).sendKeys("ola");
			Thread.sleep(200);
			WebElement element = driver.findElement(By.xpath(
					".//*[@id='nf-form-1-cont']/div/div[4]/div/div[3]/nf-section/div[1]/nf-errors/nf-section/div"));
			System.out.println(element.getText().toString());
			if (element.getText().equals("Please correct errors before submitting this form.")) {
				System.out.println("deu errado miseravi");

			} else {
				driver.findElement(By.id(button)).click();
				Thread.sleep(6000);
				if (driver.findElement(By.xpath(".//*[@id='nf-form-1-cont']/div/div[1]/p[1]")).getText().equals("Form submitted successfully.")) {
					System.out.println("aew Deu Certo miseravi");
				}
			}

			Thread.sleep(200);
			driver.navigate().to("http://localhost/formulario_teste/");
			Thread.sleep(200);
		}
		driver.close();
	}
	
	static String gerar (){
		String novo="";
		for(int i = 0;i<100000;i++){
			novo+="a";
		}
		System.out.println(novo);
		return novo;
	}

	static String gerar_strings(int tipo_teste, int campo_teste) {

		switch (campo_teste) {
		case 1:
			
			break;

		case 2:

			break;
		case 3:

			break;
		case 4:

			break;

		default:
			break;
		}

		return null;
	}
}
