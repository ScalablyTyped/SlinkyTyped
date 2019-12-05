package typingsSlinky.typescriptDashCompare.typescriptDashCompareMod.Compare.Options

import typingsSlinky.typescriptDashCompare.typescriptDashCompareStrings.broaderLeft
import typingsSlinky.typescriptDashCompare.typescriptDashCompareStrings.broaderRight
import typingsSlinky.typescriptDashCompare.typescriptDashCompareStrings.equal
import typingsSlinky.typescriptDashCompare.typescriptDashCompareStrings.mismatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Default
  extends typingsSlinky.typescriptDashCompare.typescriptDashCompareMod.Compare.Options {
  @JSName("broaderLeft")
  var broaderLeft_Default: broaderLeft
  @JSName("broaderRight")
  var broaderRight_Default: broaderRight
  @JSName("equal")
  var equal_Default: equal
  @JSName("mismatch")
  var mismatch_Default: mismatch
}

object Default {
  @scala.inline
  def apply(broaderLeft: broaderLeft, broaderRight: broaderRight, equal: equal, mismatch: mismatch): Default = {
    val __obj = js.Dynamic.literal(broaderLeft = broaderLeft.asInstanceOf[js.Any], broaderRight = broaderRight.asInstanceOf[js.Any], equal = equal.asInstanceOf[js.Any], mismatch = mismatch.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Default]
  }
}

