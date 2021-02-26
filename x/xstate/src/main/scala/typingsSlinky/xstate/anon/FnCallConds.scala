package typingsSlinky.xstate.anon

import typingsSlinky.xstate.typesMod.ChooseAction
import typingsSlinky.xstate.typesMod.ChooseConditon
import typingsSlinky.xstate.typesMod.EventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallConds extends StObject {
  
  def apply[TContext, TEvent /* <: EventObject */](conds: js.Array[ChooseConditon[TContext, TEvent]]): ChooseAction[TContext, TEvent] = js.native
}
