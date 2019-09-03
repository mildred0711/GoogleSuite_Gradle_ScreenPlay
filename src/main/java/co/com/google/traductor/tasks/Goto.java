package co.com.google.traductor.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.google.traductor.userinterfaces.GoogleAppsComponent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Goto implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(GoogleAppsComponent.GOOGLE_APPS),
				         Click.on(GoogleAppsComponent.GOOGLE_TRANSLATE));
		
	}

	public static Goto theApp() {
		return instrumented(Goto.class);
	}
}