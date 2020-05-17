package typingsSlinky.unistUtilIs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * Check if a node passes a test
    *
    * @param node node to check
    * @param index index of node in parent
    * @param parent parent of node
    * @typeParam T type of node that passes test
    * @returns true if type T is found, false otherwise
    */
  type TestFunction[T /* <: typingsSlinky.unist.mod.Node */] = js.Function3[
    /* node */ js.Any, 
    /* index */ js.UndefOr[scala.Double], 
    /* parent */ js.UndefOr[typingsSlinky.unist.mod.Parent], 
    /* is T */ scala.Boolean
  ]
  /**
    * Check that some attributes on a node are matched
    *
    * @typeParam T type of node that passes test
    */
  type TestObject[T /* <: typingsSlinky.unist.mod.Node */] = typingsSlinky.std.Partial[T]
  /**
    * Check that type property matches expectation for a node
    *
    * @typeParam T type of node that passes test
    */
  type TestType[T /* <: typingsSlinky.unist.mod.Node */] = /* import warning: importer.ImportType#apply Failed type conversion: T['type'] */ js.Any
}
