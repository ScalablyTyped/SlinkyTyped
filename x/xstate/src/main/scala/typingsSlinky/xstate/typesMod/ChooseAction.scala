package typingsSlinky.xstate.typesMod

import typingsSlinky.xstate.typesMod.ActionTypes.Choose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChooseAction[TContext, TEvent /* <: EventObject */] extends ActionObject[TContext, TEvent] {
  
  var conds: js.Array[ChooseConditon[TContext, TEvent]] = js.native
  
  @JSName("type")
  var type_ChooseAction: Choose = js.native
}
object ChooseAction {
  
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](conds: js.Array[ChooseConditon[TContext, TEvent]], `type`: Choose): ChooseAction[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(conds = conds.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseAction[TContext, TEvent]]
  }
  
  @scala.inline
  implicit class ChooseActionMutableBuilder[Self <: ChooseAction[_, _], TContext, TEvent /* <: EventObject */] (val x: Self with (ChooseAction[TContext, TEvent])) extends AnyVal {
    
    @scala.inline
    def setConds(value: js.Array[ChooseConditon[TContext, TEvent]]): Self = StObject.set(x, "conds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCondsVarargs(value: (ChooseConditon[TContext, TEvent])*): Self = StObject.set(x, "conds", js.Array(value :_*))
    
    @scala.inline
    def setType(value: Choose): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
