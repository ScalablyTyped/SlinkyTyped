package typingsSlinky.wordpressComponents.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Slot extends StObject {
  
  /**
    * Use Popover.Slot to render the Popover to a specific location on the page.
    *
    * This is useful to allow style cascade to take effect.
    *
    * @example
    *
    * import { render } from 'react';
    * import { Popover } from '@wordpress/components';
    * import Content from './Content';
    *
    * const app = document.getElementById( 'app' );
    * render(
    *   <div>
    *       <Content />
    *       <Popover.Slot />
    *   </div>,
    *   app
    * );
    */
  def Slot(): ReactElement = js.native
}
object Slot {
  
  @scala.inline
  def apply(Slot: () => ReactElement): Slot = {
    val __obj = js.Dynamic.literal(Slot = js.Any.fromFunction0(Slot))
    __obj.asInstanceOf[Slot]
  }
  
  @scala.inline
  implicit class SlotMutableBuilder[Self <: Slot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSlot(value: () => ReactElement): Self = StObject.set(x, "Slot", js.Any.fromFunction0(value))
  }
}
