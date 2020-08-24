package typingsSlinky.webdriverio.webdriverioCoreMod.WebdriverIO

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HTTP request data. (copied from the puppeteer-core package as there is currently
  * no way to access these types otherwise)
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.webdriverio.webdriverioStrings.VeryLow
  - typingsSlinky.webdriverio.webdriverioStrings.Low
  - typingsSlinky.webdriverio.webdriverioStrings.Medium
  - typingsSlinky.webdriverio.webdriverioStrings.High
  - typingsSlinky.webdriverio.webdriverioStrings.VeryHigh
*/
trait ResourcePriority extends js.Object

object ResourcePriority {
  @scala.inline
  def High: typingsSlinky.webdriverio.webdriverioStrings.High = "High".asInstanceOf[typingsSlinky.webdriverio.webdriverioStrings.High]
  @scala.inline
  def Low: typingsSlinky.webdriverio.webdriverioStrings.Low = "Low".asInstanceOf[typingsSlinky.webdriverio.webdriverioStrings.Low]
  @scala.inline
  def Medium: typingsSlinky.webdriverio.webdriverioStrings.Medium = "Medium".asInstanceOf[typingsSlinky.webdriverio.webdriverioStrings.Medium]
  @scala.inline
  def VeryHigh: typingsSlinky.webdriverio.webdriverioStrings.VeryHigh = "VeryHigh".asInstanceOf[typingsSlinky.webdriverio.webdriverioStrings.VeryHigh]
  @scala.inline
  def VeryLow: typingsSlinky.webdriverio.webdriverioStrings.VeryLow = "VeryLow".asInstanceOf[typingsSlinky.webdriverio.webdriverioStrings.VeryLow]
}

