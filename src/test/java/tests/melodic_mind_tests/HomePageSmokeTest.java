package tests.melodic_mind_tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTests;

public class HomePageSmokeTest extends BaseTests {

    @Test
    public void checkMostImportantElements() {
        app.mmHomePage().isLaVocalOpenButtonAppeared();
        app.mmHomePage().musicGuruOpenButtonAppeared();
        app.mmHomePage().songWriterStudioLearnMoreButtonAppeared();
        app.mmHomePage().earWizardLearnMoreButtonAppeared();
        app.mmHomePage().isSubscribeButtonAppeared();
        app.mmHomePage().isDiscordButtonAppeared();
        app.mmHomePage().isTikTokButtonButtonAppeared();
        app.mmHomePage().isYouTubeButtonAppeared();
        app.mmHomePage().isTwitterButtonAppeared();
        app.mmHomePage().isFacebookButtonAppeared();
        app.mmHomePage().isInstagramButtonAppeared();
        app.mmHomePage().isEMailButtonAppeared();
        app.mmHomePage().isFooterElementsAppeared();
    }
}
