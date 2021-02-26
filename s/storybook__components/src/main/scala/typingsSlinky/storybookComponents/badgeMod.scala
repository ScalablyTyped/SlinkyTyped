package typingsSlinky.storybookComponents

import slinky.core.ReactComponentClass
import typingsSlinky.storybookComponents.storybookComponentsStrings.critical
import typingsSlinky.storybookComponents.storybookComponentsStrings.negative
import typingsSlinky.storybookComponents.storybookComponentsStrings.neutral
import typingsSlinky.storybookComponents.storybookComponentsStrings.positive
import typingsSlinky.storybookComponents.storybookComponentsStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object badgeMod {
  
  @JSImport("@storybook/components/dist/Badge/Badge", "Badge")
  @js.native
  val Badge: ReactComponentClass[BadgeProps] = js.native
  
  @js.native
  trait BadgeProps extends StObject {
    
    var status: positive | negative | neutral | warning | critical = js.native
  }
  object BadgeProps {
    
    @scala.inline
    def apply(status: positive | negative | neutral | warning | critical): BadgeProps = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[BadgeProps]
    }
    
    @scala.inline
    implicit class BadgePropsMutableBuilder[Self <: BadgeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStatus(value: positive | negative | neutral | warning | critical): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
