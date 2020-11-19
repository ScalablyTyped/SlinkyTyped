package typingsSlinky.typography.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typography extends js.Object {
  
  def adjustFontSizeTo(): js.Object = js.native
  def adjustFontSizeTo(value: String): js.Object = js.native
  def adjustFontSizeTo(value: Double): js.Object = js.native
  @JSName("adjustFontSizeTo")
  var adjustFontSizeTo_Original: js.Function1[/* value */ js.UndefOr[Double | String], js.Object] = js.native
  
  def createStyles(): String = js.native
  
  def establishBaseline(): BaseLine = js.native
  @JSName("establishBaseline")
  var establishBaseline_Original: js.Function0[BaseLine] = js.native
  
  def injectStyles(): Unit = js.native
  
  def linesForFontSize(fontSize: Double): Double = js.native
  @JSName("linesForFontSize")
  var linesForFontSize_Original: js.Function1[/* fontSize */ Double, Double] = js.native
  
  var options: TypographyOptions = js.native
  
  def rhythm(value: Double): String = js.native
  @JSName("rhythm")
  var rhythm_Original: js.Function1[/* value */ Double, String] = js.native
  
  def scale(value: Double): BaseLine = js.native
  @JSName("scale")
  var scale_Original: js.Function1[/* value */ Double, BaseLine] = js.native
  
  def toJSON(): js.Object = js.native
}
