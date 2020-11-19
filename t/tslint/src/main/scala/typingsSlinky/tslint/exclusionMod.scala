package typingsSlinky.tslint

import typingsSlinky.std.Partial
import typingsSlinky.std.Set
import typingsSlinky.tslint.completedDocsRuleMod.All
import typingsSlinky.tslint.exclusionDescriptorsMod.ExclusionDescriptor
import typingsSlinky.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/rules/completed-docs/exclusion", JSImport.Namespace)
@js.native
object exclusionMod extends js.Object {
  
  @js.native
  abstract class Exclusion[TDescriptor /* <: ExclusionDescriptor */] () extends js.Object {
    def this(descriptor: Partial[TDescriptor]) = this()
    
    /* protected */ def createSet[T /* <: All | String */](): Set[T] = js.native
    /* protected */ def createSet[T /* <: All | String */](values: js.Array[T]): Set[T] = js.native
    
    val descriptor: Partial[TDescriptor] = js.native
    
    def excludes(node: Node): Boolean = js.native
  }
}
