package typingsSlinky.seleniumDashWebdriver

import typingsSlinky.seleniumDashWebdriver.libByMod.ByHash
import typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.Alert
import typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.By
import typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.Condition
import typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.Locator
import typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.WebDriver
import typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.WebElement
import typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.WebElementCondition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver/lib/until", JSImport.Namespace)
@js.native
object libUntilMod extends js.Object {
  def ableToSwitchToFrame(frame: js.Function1[/* webdriver */ WebDriver, WebElement]): Condition[Boolean] = js.native
  def ableToSwitchToFrame(frame: Double): Condition[Boolean] = js.native
  def ableToSwitchToFrame(frame: ByHash): Condition[Boolean] = js.native
  def ableToSwitchToFrame(frame: By): Condition[Boolean] = js.native
  def ableToSwitchToFrame(frame: WebElement): Condition[Boolean] = js.native
  def alertIsPresent(): Condition[Alert] = js.native
  def elementIsDisabled(element: WebElement): WebElementCondition = js.native
  def elementIsEnabled(element: WebElement): WebElementCondition = js.native
  def elementIsNotSelected(element: WebElement): WebElementCondition = js.native
  def elementIsNotVisible(element: WebElement): WebElementCondition = js.native
  def elementIsSelected(element: WebElement): WebElementCondition = js.native
  def elementIsVisible(element: WebElement): WebElementCondition = js.native
  def elementLocated(locator: Locator): WebElementCondition = js.native
  def elementTextContains(element: WebElement, substr: String): WebElementCondition = js.native
  def elementTextIs(element: WebElement, text: String): WebElementCondition = js.native
  def elementTextMatches(element: WebElement, regex: js.RegExp): WebElementCondition = js.native
  def elementsLocated(locator: Locator): Condition[js.Array[WebElement]] = js.native
  def stalenessOf(element: WebElement): Condition[Boolean] = js.native
  def titleContains(substr: String): Condition[Boolean] = js.native
  def titleIs(title: String): Condition[Boolean] = js.native
  def titleMatches(regex: js.RegExp): Condition[Boolean] = js.native
  def urlContains(substrUrl: String): Condition[Boolean] = js.native
  def urlIs(url: String): Condition[Boolean] = js.native
  def urlMatches(regex: js.RegExp): Condition[Boolean] = js.native
}

