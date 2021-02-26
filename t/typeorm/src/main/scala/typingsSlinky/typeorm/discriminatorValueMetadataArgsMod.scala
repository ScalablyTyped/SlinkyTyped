package typingsSlinky.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object discriminatorValueMetadataArgsMod {
  
  @js.native
  trait DiscriminatorValueMetadataArgs extends StObject {
    
    /**
      * Class to which discriminator name is applied.
      */
    val target: js.Function | String = js.native
    
    /**
      * Discriminator value.
      */
    val value: js.Any = js.native
  }
  object DiscriminatorValueMetadataArgs {
    
    @scala.inline
    def apply(target: js.Function | String, value: js.Any): DiscriminatorValueMetadataArgs = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiscriminatorValueMetadataArgs]
    }
    
    @scala.inline
    implicit class DiscriminatorValueMetadataArgsMutableBuilder[Self <: DiscriminatorValueMetadataArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTarget(value: js.Function | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
