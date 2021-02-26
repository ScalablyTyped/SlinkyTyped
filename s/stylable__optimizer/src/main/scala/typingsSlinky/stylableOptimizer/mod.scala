package typingsSlinky.stylableOptimizer

import typingsSlinky.postcss.mod.Comment_
import typingsSlinky.postcss.mod.Node
import typingsSlinky.postcss.mod.Root_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@stylable/optimizer", "StylableClassNameOptimizer")
  @js.native
  class StylableClassNameOptimizer ()
    extends typingsSlinky.stylableOptimizer.classnameOptimizerMod.StylableClassNameOptimizer
  
  @JSImport("@stylable/optimizer", "StylableNamespaceOptimizer")
  @js.native
  class StylableNamespaceOptimizer ()
    extends typingsSlinky.stylableOptimizer.namespaceOptimizerMod.StylableNamespaceOptimizer
  
  @JSImport("@stylable/optimizer", "StylableOptimizer")
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
  
  @JSImport("@stylable/optimizer", "createCommentFromNode")
  @js.native
  def createCommentFromNode(label: String, node: Node): js.Array[Comment_] = js.native
  
  @JSImport("@stylable/optimizer", "createLineByLineComment")
  @js.native
  def createLineByLineComment(node: Node): js.Array[Comment_] = js.native
  
  @JSImport("@stylable/optimizer", "removeCommentNodes")
  @js.native
  def removeCommentNodes(root: Root_): Unit = js.native
  
  @JSImport("@stylable/optimizer", "removeEmptyNodes")
  @js.native
  def removeEmptyNodes(root: Root_): Unit = js.native
  
  @JSImport("@stylable/optimizer", "removeRecursiveUpIfEmpty")
  @js.native
  def removeRecursiveUpIfEmpty(node: Node): Unit = js.native
  
  @JSImport("@stylable/optimizer", "replaceRecursiveUpIfEmpty")
  @js.native
  def replaceRecursiveUpIfEmpty(label: String, node: Node): Unit = js.native
}
