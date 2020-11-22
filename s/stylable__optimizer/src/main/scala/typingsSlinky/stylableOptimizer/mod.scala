package typingsSlinky.stylableOptimizer

import typingsSlinky.postcss.mod.Comment_
import typingsSlinky.postcss.mod.Node
import typingsSlinky.postcss.mod.Root_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/optimizer", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def createCommentFromNode(label: String, node: Node): js.Array[Comment_] = js.native
  
  def createLineByLineComment(node: Node): js.Array[Comment_] = js.native
  
  def removeCommentNodes(root: Root_): Unit = js.native
  
  def removeEmptyNodes(root: Root_): Unit = js.native
  
  def removeRecursiveUpIfEmpty(node: Node): Unit = js.native
  
  def replaceRecursiveUpIfEmpty(label: String, node: Node): Unit = js.native
  
  @js.native
  class StylableClassNameOptimizer ()
    extends typingsSlinky.stylableOptimizer.classnameOptimizerMod.StylableClassNameOptimizer
  
  @js.native
  class StylableNamespaceOptimizer ()
    extends typingsSlinky.stylableOptimizer.namespaceOptimizerMod.StylableNamespaceOptimizer
  
  @js.native
  class StylableOptimizer ()
    extends typingsSlinky.stylableOptimizer.stylableOptimizerMod.StylableOptimizer {
    def this(classNameOptimizer: typingsSlinky.stylableOptimizer.classnameOptimizerMod.StylableClassNameOptimizer) = this()
    def this(
      classNameOptimizer: js.UndefOr[scala.Nothing],
      namespaceOptimizer: typingsSlinky.stylableOptimizer.namespaceOptimizerMod.StylableNamespaceOptimizer
    ) = this()
    def this(
      classNameOptimizer: typingsSlinky.stylableOptimizer.classnameOptimizerMod.StylableClassNameOptimizer,
      namespaceOptimizer: typingsSlinky.stylableOptimizer.namespaceOptimizerMod.StylableNamespaceOptimizer
    ) = this()
  }
}
