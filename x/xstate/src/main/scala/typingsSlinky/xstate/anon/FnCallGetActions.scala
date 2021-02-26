package typingsSlinky.xstate.anon

import typingsSlinky.xstate.typesMod.ActionObject
import typingsSlinky.xstate.typesMod.EventObject
import typingsSlinky.xstate.typesMod.PureAction
import typingsSlinky.xstate.typesMod.SingleOrArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallGetActions extends StObject {
  
  def apply[TContext, TEvent /* <: EventObject */](
    getActions: js.Function2[
      /* context */ TContext, 
      /* event */ TEvent, 
      js.UndefOr[SingleOrArray[ActionObject[TContext, TEvent]]]
    ]
  ): PureAction[TContext, TEvent] = js.native
}
