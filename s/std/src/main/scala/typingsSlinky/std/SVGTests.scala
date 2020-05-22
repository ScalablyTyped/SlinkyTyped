package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGTests extends js.Object {
  val requiredExtensions: org.scalajs.dom.raw.SVGStringList
  val systemLanguage: org.scalajs.dom.raw.SVGStringList
}

object SVGTests {
  @scala.inline
  def apply(
    requiredExtensions: org.scalajs.dom.raw.SVGStringList,
    systemLanguage: org.scalajs.dom.raw.SVGStringList
  ): SVGTests = {
    val __obj = js.Dynamic.literal(requiredExtensions = requiredExtensions.asInstanceOf[js.Any], systemLanguage = systemLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGTests]
  }
}

