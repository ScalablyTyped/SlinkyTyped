package typingsSlinky.webpackValidator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Validate your webpack configs with joi
    */
  @JSImport("webpack-validator", JSImport.Namespace)
  @js.native
  def apply(
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration */ js.Any
  ): js.Any = js.native
  /**
    * Validate your webpack configs with joi
    */
  @JSImport("webpack-validator", JSImport.Namespace)
  @js.native
  def apply(
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration */ js.Any,
    options: ValidationOptions
  ): js.Any = js.native
  
  @js.native
  trait ValidationOptions extends StObject {
    
    var `loader-enforce-include-or-exclude`: js.UndefOr[Boolean] = js.native
    
    var `loader-prefer-include`: js.UndefOr[Boolean] = js.native
    
    var `no-root-files-node-modules-nameclash`: js.UndefOr[Boolean] = js.native
  }
  object ValidationOptions {
    
    @scala.inline
    def apply(): ValidationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValidationOptions]
    }
    
    @scala.inline
    implicit class ValidationOptionsMutableBuilder[Self <: ValidationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setLoader-enforce-include-or-exclude`(value: Boolean): Self = StObject.set(x, "loader-enforce-include-or-exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setLoader-enforce-include-or-excludeUndefined`: Self = StObject.set(x, "loader-enforce-include-or-exclude", js.undefined)
      
      @scala.inline
      def `setLoader-prefer-include`(value: Boolean): Self = StObject.set(x, "loader-prefer-include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setLoader-prefer-includeUndefined`: Self = StObject.set(x, "loader-prefer-include", js.undefined)
      
      @scala.inline
      def `setNo-root-files-node-modules-nameclash`(value: Boolean): Self = StObject.set(x, "no-root-files-node-modules-nameclash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setNo-root-files-node-modules-nameclashUndefined`: Self = StObject.set(x, "no-root-files-node-modules-nameclash", js.undefined)
    }
  }
}
