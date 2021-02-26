package typingsSlinky.wordpressComponents.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ConsumerProps
import typingsSlinky.wordpressComponents.disabledMod.Disabled.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Disabled {
  
  @JSImport("@wordpress/components", "Disabled")
  @js.native
  def apply(props: Props): ReactElement = js.native
  @JSImport("@wordpress/components", "Disabled")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@wordpress/components", "Disabled.Consumer")
  @js.native
  def Consumer: ReactComponentClass[ConsumerProps[Boolean]] = js.native
  @scala.inline
  def Consumer_=(x: ReactComponentClass[ConsumerProps[Boolean]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Consumer")(x.asInstanceOf[js.Any])
}
