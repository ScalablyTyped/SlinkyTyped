package typingsSlinky.servicenow.servicenow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlideQueryCondition extends StObject {
  
  def addCondition(name: String, oper: QueryOperator, value: String): GlideQueryCondition = js.native
  def addCondition(name: String, oper: QueryOperator, value: js.Object): GlideQueryCondition = js.native
  def addCondition(name: String, oper: QueryOperator, value: Double): GlideQueryCondition = js.native
  def addCondition(name: String, value: String): GlideQueryCondition = js.native
  def addCondition(name: String, value: js.Object): GlideQueryCondition = js.native
  def addCondition(name: String, value: Double): GlideQueryCondition = js.native
  
  def addOrCondition(name: String, oper: QueryOperator, value: String): GlideQueryCondition = js.native
  def addOrCondition(name: String, oper: QueryOperator, value: js.Object): GlideQueryCondition = js.native
  def addOrCondition(name: String, oper: QueryOperator, value: Double): GlideQueryCondition = js.native
  def addOrCondition(name: String, value: String): GlideQueryCondition = js.native
  def addOrCondition(name: String, value: js.Object): GlideQueryCondition = js.native
  def addOrCondition(name: String, value: Double): GlideQueryCondition = js.native
}
