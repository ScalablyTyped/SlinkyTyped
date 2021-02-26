package typingsSlinky.vueNiceDates.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HandleClickDate extends StObject {
  
  def changeLastValidDate(date: String): Unit = js.native
  
  def handleClickDate(date: js.Date, `type`: String): Unit = js.native
  
  def initDate(): Unit = js.native
  
  def isValidAndSelectable(date: js.Date): Boolean = js.native
}
object HandleClickDate {
  
  @scala.inline
  def apply(
    changeLastValidDate: String => Unit,
    handleClickDate: (js.Date, String) => Unit,
    initDate: () => Unit,
    isValidAndSelectable: js.Date => Boolean
  ): HandleClickDate = {
    val __obj = js.Dynamic.literal(changeLastValidDate = js.Any.fromFunction1(changeLastValidDate), handleClickDate = js.Any.fromFunction2(handleClickDate), initDate = js.Any.fromFunction0(initDate), isValidAndSelectable = js.Any.fromFunction1(isValidAndSelectable))
    __obj.asInstanceOf[HandleClickDate]
  }
  
  @scala.inline
  implicit class HandleClickDateMutableBuilder[Self <: HandleClickDate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeLastValidDate(value: String => Unit): Self = StObject.set(x, "changeLastValidDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandleClickDate(value: (js.Date, String) => Unit): Self = StObject.set(x, "handleClickDate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInitDate(value: () => Unit): Self = StObject.set(x, "initDate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsValidAndSelectable(value: js.Date => Boolean): Self = StObject.set(x, "isValidAndSelectable", js.Any.fromFunction1(value))
  }
}
