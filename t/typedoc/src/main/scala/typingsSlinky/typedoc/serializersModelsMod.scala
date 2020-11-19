package typingsSlinky.typedoc

import typingsSlinky.typedoc.abstractMod.Decorator
import typingsSlinky.typedoc.fileMod.SourceReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/serialization/serializers/models", JSImport.Namespace)
@js.native
object serializersModelsMod extends js.Object {
  
  @js.native
  class DecoratorWrapper protected ()
    extends typingsSlinky.typedoc.decoratorWrapperMod.DecoratorWrapper {
    def this(decorator: Decorator) = this()
  }
  
  @js.native
  class SourceReferenceWrapper protected ()
    extends typingsSlinky.typedoc.sourceReferenceWrapperMod.SourceReferenceWrapper {
    def this(sourceReference: SourceReference) = this()
  }
}
