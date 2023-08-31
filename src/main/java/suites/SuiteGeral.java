package suites;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import core.DriverFactory;
import pages.LoginPage;
import testes.ContaTest;
import testes.MovimentacaoTest;
import testes.RemoverMovimentacaoContaTest;
import testes.ResumoTest;
import testes.SaldoTest;

@RunWith(Suite.class)
@SuiteClasses({
	ContaTest.class,
	MovimentacaoTest.class,
	RemoverMovimentacaoContaTest.class,
	SaldoTest.class,
	ResumoTest.class
})
public class SuiteGeral {
	private static LoginPage page = new LoginPage();
	
	@BeforeClass
	public static void reset() {
		page.acessarTelaInicial();
		page.setEmail("rodrigo@dias");
		page.setSenha("654321");
		page.entrar();
		page.resetar();
		DriverFactory.killDriver();
		
	}
	
}
