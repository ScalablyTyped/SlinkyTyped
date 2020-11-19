package typingsSlinky.storybookAddonStoryshotsPuppeteer.configMod

import typingsSlinky.jestImageSnapshot.mod.MatchImageSnapshotOptions
import typingsSlinky.puppeteer.mod.Base64ScreenShotOptions
import typingsSlinky.puppeteer.mod.Browser
import typingsSlinky.puppeteer.mod.DirectNavigationOptions
import typingsSlinky.puppeteer.mod.Page
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageSnapshotConfig extends CommonConfig {
  
  def afterScreenshot(options: typingsSlinky.storybookAddonStoryshotsPuppeteer.anon.Context): Unit = js.native
  
  def beforeScreenshot(page: Page, options: Options): Unit = js.native
  
  def getMatchOptions(options: Options): MatchImageSnapshotOptions = js.native
  
  def getScreenshotOptions(options: Options): Base64ScreenShotOptions = js.native
}
object ImageSnapshotConfig {
  
  @scala.inline
  def apply(
    afterScreenshot: typingsSlinky.storybookAddonStoryshotsPuppeteer.anon.Context => Unit,
    beforeScreenshot: (Page, Options) => Unit,
    chromeExecutablePath: String,
    customizePage: Page => js.Promise[Unit],
    getCustomBrowser: () => js.Promise[Browser],
    getGotoOptions: Options => DirectNavigationOptions,
    getMatchOptions: Options => MatchImageSnapshotOptions,
    getScreenshotOptions: Options => Base64ScreenShotOptions,
    setupTimeout: Double,
    storybookUrl: String,
    testTimeout: Double
  ): ImageSnapshotConfig = {
    val __obj = js.Dynamic.literal(afterScreenshot = js.Any.fromFunction1(afterScreenshot), beforeScreenshot = js.Any.fromFunction2(beforeScreenshot), chromeExecutablePath = chromeExecutablePath.asInstanceOf[js.Any], customizePage = js.Any.fromFunction1(customizePage), getCustomBrowser = js.Any.fromFunction0(getCustomBrowser), getGotoOptions = js.Any.fromFunction1(getGotoOptions), getMatchOptions = js.Any.fromFunction1(getMatchOptions), getScreenshotOptions = js.Any.fromFunction1(getScreenshotOptions), setupTimeout = setupTimeout.asInstanceOf[js.Any], storybookUrl = storybookUrl.asInstanceOf[js.Any], testTimeout = testTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageSnapshotConfig]
  }
  
  @scala.inline
  implicit class ImageSnapshotConfigOps[Self <: ImageSnapshotConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAfterScreenshot(value: typingsSlinky.storybookAddonStoryshotsPuppeteer.anon.Context => Unit): Self = this.set("afterScreenshot", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeScreenshot(value: (Page, Options) => Unit): Self = this.set("beforeScreenshot", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetMatchOptions(value: Options => MatchImageSnapshotOptions): Self = this.set("getMatchOptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetScreenshotOptions(value: Options => Base64ScreenShotOptions): Self = this.set("getScreenshotOptions", js.Any.fromFunction1(value))
  }
}
