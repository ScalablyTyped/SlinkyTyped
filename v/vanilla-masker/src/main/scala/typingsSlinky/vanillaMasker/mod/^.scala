package typingsSlinky.vanillaMasker.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.NodeListOf
import typingsSlinky.vanillaMasker.anon.MaskAlphaNum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vanilla-masker", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(el: Element): MaskAlphaNum = js.native
  def apply(el: NodeListOf[Element with Node]): MaskAlphaNum = js.native
  
  def toAlphaNumeric(value: String): String = js.native
  def toAlphaNumeric(value: Double): String = js.native
  
  def toMoney(value: String): String = js.native
  def toMoney(value: String, options: MoneyOptions): String = js.native
  def toMoney(value: Double): String = js.native
  def toMoney(value: Double, options: MoneyOptions): String = js.native
  
  def toNumber(value: String): String = js.native
  def toNumber(value: Double): String = js.native
  
  def toPattern(value: String): String = js.native
  def toPattern(value: String, options: String): String = js.native
  def toPattern(value: String, options: PatternOptions): String = js.native
  def toPattern(value: Double): String = js.native
  def toPattern(value: Double, options: String): String = js.native
  def toPattern(value: Double, options: PatternOptions): String = js.native
}
