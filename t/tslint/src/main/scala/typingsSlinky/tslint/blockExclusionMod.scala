package typingsSlinky.tslint

import typingsSlinky.std.Partial
import typingsSlinky.std.Set
import typingsSlinky.tslint.completedDocsRuleMod.Visibility
import typingsSlinky.tslint.exclusionDescriptorsMod.ExclusionDescriptor
import typingsSlinky.tslint.exclusionMod.Exclusion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blockExclusionMod {
  
  @JSImport("tslint/lib/rules/completed-docs/blockExclusion", "BlockExclusion")
  @js.native
  class BlockExclusion () extends Exclusion[IBlockExclusionDescriptor] {
    def this(descriptor: Partial[IBlockExclusionDescriptor]) = this()
    
    val visibilities: Set[Visibility] = js.native
  }
  
  @js.native
  trait IBlockExclusionDescriptor extends ExclusionDescriptor {
    
    var visibilities: js.UndefOr[js.Array[Visibility]] = js.native
  }
  object IBlockExclusionDescriptor {
    
    @scala.inline
    def apply(): IBlockExclusionDescriptor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBlockExclusionDescriptor]
    }
    
    @scala.inline
    implicit class IBlockExclusionDescriptorMutableBuilder[Self <: IBlockExclusionDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVisibilities(value: js.Array[Visibility]): Self = StObject.set(x, "visibilities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibilitiesUndefined: Self = StObject.set(x, "visibilities", js.undefined)
      
      @scala.inline
      def setVisibilitiesVarargs(value: Visibility*): Self = StObject.set(x, "visibilities", js.Array(value :_*))
    }
  }
}
