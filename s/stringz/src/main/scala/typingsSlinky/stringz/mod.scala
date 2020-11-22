package typingsSlinky.stringz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stringz", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def indexOf(str: String, searchStr: String): Double = js.native
  def indexOf(str: String, searchStr: String, pos: Double): Double = js.native
  
  def length(str: String): Double = js.native
  
  def limit(str: String): String = js.native
  def limit(
    str: String,
    limit: js.UndefOr[scala.Nothing],
    padString: js.UndefOr[scala.Nothing],
    padPosition: String
  ): String = js.native
  def limit(str: String, limit: js.UndefOr[scala.Nothing], padString: String): String = js.native
  def limit(str: String, limit: js.UndefOr[scala.Nothing], padString: String, padPosition: String): String = js.native
  def limit(str: String, limit: Double): String = js.native
  def limit(str: String, limit: Double, padString: js.UndefOr[scala.Nothing], padPosition: String): String = js.native
  def limit(str: String, limit: Double, padString: String): String = js.native
  def limit(str: String, limit: Double, padString: String, padPosition: String): String = js.native
  
  def substr(str: String): String = js.native
  def substr(str: String, begin: js.UndefOr[scala.Nothing], len: Double): String = js.native
  def substr(str: String, begin: Double): String = js.native
  def substr(str: String, begin: Double, len: Double): String = js.native
  
  def substring(str: String): String = js.native
  def substring(str: String, begin: js.UndefOr[scala.Nothing], end: Double): String = js.native
  def substring(str: String, begin: Double): String = js.native
  def substring(str: String, begin: Double, end: Double): String = js.native
  
  def toArray(str: String): js.Array[String] = js.native
}
