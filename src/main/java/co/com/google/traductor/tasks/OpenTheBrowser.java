package co.com.google.traductor.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.google.traductor.userinterfaces.GoogleHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenTheBrowser implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(new GoogleHomePage()));
	}

	public static OpenTheBrowser on() {
		return instrumented(OpenTheBrowser.class);
	}
}