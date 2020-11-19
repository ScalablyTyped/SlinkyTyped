package typingsSlinky.stackUtils.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackUtils extends js.Object {
  
  def at(): CallSiteLike = js.native
  def at(startStackFunction: js.Function): CallSiteLike = js.native
  
  def capture(): js.Array[CallSite] = js.native
  def capture(limit: js.UndefOr[scala.Nothing], startStackFunction: js.Function): js.Array[CallSite] = js.native
  def capture(limit: Double): js.Array[CallSite] = js.native
  def capture(limit: Double, startStackFunction: js.Function): js.Array[CallSite] = js.native
  def capture(startStackFunction: js.Function): js.Array[CallSite] = js.native
  
  def captureString(): String = js.native
  def captureString(limit: js.UndefOr[scala.Nothing], startStackFunction: js.Function): String = js.native
  def captureString(limit: Double): String = js.native
  def captureString(limit: Double, startStackFunction: js.Function): String = js.native
  def captureString(startStackFunction: js.Function): String = js.native
  
  def clean(stack: String): String = js.native
  def clean(stack: js.Array[String]): String = js.native
  
  def parseLine(line: String): StackLineData | Null = js.native
}
