package typingsSlinky.unified

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /**
    * An attacher is the thing passed to `use`.
    * It configures the processor and in turn can receive options.
    *
    * Attachers can configure processors, such as by interacting with parsers and compilers, linking them to other processors, or by specifying how the syntax tree is handled.
    *
    * @param settings Configuration
    * @typeParam S Plugin settings
    * @typeParam P Processor settings
    * @returns Optional Transformer.
    */
  type Attacher[S /* <: js.Array[_] */, P] = js.ThisFunction1[
    /* this */ typingsSlinky.unified.mod.Processor[P], 
    /* settings */ S, 
    typingsSlinky.unified.mod.Transformer | scala.Unit
  ]
  
  /**
    * Transform an AST node/tree into text
    *
    * @param node Node/tree to be stringified
    * @param file File associated with node
    * @returns Compiled text
    */
  type CompilerFunction = js.Function2[
    /* node */ typingsSlinky.unist.mod.Node, 
    /* file */ typingsSlinky.vfile.mod.VFile, 
    java.lang.String
  ]
  
  /**
    * Transform file contents into an AST
    *
    * @param text Text to transform into AST node(s)
    * @param file File associated with text
    * @returns Parsed AST node/tree
    */
  type ParserFunction = js.Function2[
    /* text */ java.lang.String, 
    /* file */ typingsSlinky.vfile.mod.VFile, 
    typingsSlinky.unist.mod.Node
  ]
  
  /**
    * A union of the different ways to add plugins to unified
    *
    * @typeParam S Plugin settings
    * @typeParam P Processor settings
    */
  type Pluggable[S /* <: js.Array[_] */, P] = (typingsSlinky.unified.mod.Plugin[S, P]) | (typingsSlinky.unified.mod.Preset[S, P]) | (typingsSlinky.unified.mod.PluginTuple[S, P])
  
  /**
    * A list of plugins and presets
    *
    * @typeParam P Processor settings
    */
  type PluggableList[P] = js.Array[typingsSlinky.unified.mod.Pluggable[js.Array[js.UndefOr[js.Any]], P]]
  
  /**
    * A Plugin (Attacher) is the thing passed to `use`.
    * It configures the processor and in turn can receive options.
    *
    * Attachers can configure processors, such as by interacting with parsers and compilers, linking them to other processors, or by specifying how the syntax tree is handled.
    *
    * @param settings Configuration
    * @typeParam S Plugin settings
    * @typeParam P Processor settings
    * @returns Optional Transformer.
    */
  type Plugin[S /* <: js.Array[_] */, P] = typingsSlinky.unified.mod.Attacher[S, P]
  
  /**
    * A pairing of a plugin with its settings
    *
    * @typeParam S Plugin settings
    * @typeParam P Processor settings
    */
  type PluginTuple[S /* <: js.Array[_] */, P] = Array[(typingsSlinky.unified.mod.Plugin[S, P]) | js.Any]
  
  /**
    * Access results from transforms
    *
    * @param error Error if any occurred
    * @param vfile File with updated content
    */
  type ProcessCallback = js.Function2[
    /* error */ js.Error | scala.Null, 
    /* file */ typingsSlinky.vfile.mod.VFile, 
    scala.Unit
  ]
  
  /**
    * Access results from transforms
    *
    * @param error Error if any occurred
    * @param node Transformed AST tree/node
    * @param vfile File associated with node
    */
  type RunCallback = js.Function3[
    /* error */ js.Error | scala.Null, 
    /* node */ typingsSlinky.unist.mod.Node, 
    /* file */ typingsSlinky.vfile.mod.VFile, 
    scala.Unit
  ]
  
  /**
    * Configuration passed to a Plugin or Processor
    */
  type Settings = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  /**
    * Transformers modify the syntax tree or metadata of a file. A transformer is a function which is invoked each time a file is passed through the transform phase.
    * If an error occurs (either because it’s thrown, returned, rejected, or passed to `next`), the process stops.
    *
    * The transformation process in unified is handled by `trough`, see it’s documentation for the exact semantics of transformers.
    *
    * @param node Node or tree to be transformed
    * @param file File associated with node or tree
    * @param next If the signature of a transformer includes `next` (third argument), the function may finish asynchronous, and must invoke `next()`.
    * @returns
    * - `void` — If nothing is returned, the next transformer keeps using same tree.
    * - `Error` — Can be returned to stop the process
    * - `Node` — Can be returned and results in further transformations and `stringify`s to be performed on the new tree
    * - `Promise` — If a promise is returned, the function is asynchronous, and must be resolved (optionally with a `Node`) or rejected (optionally with an `Error`)
    */
  type Transformer = js.Function3[
    /* node */ typingsSlinky.unist.mod.Node, 
    /* file */ typingsSlinky.vfile.mod.VFile, 
    /* next */ js.UndefOr[
      js.Function3[
        /* error */ js.Error | scala.Null, 
        /* tree */ typingsSlinky.unist.mod.Node, 
        /* file */ typingsSlinky.vfile.mod.VFile, 
        js.Object
      ]
    ], 
    js.Error | typingsSlinky.unist.mod.Node | (js.Promise[typingsSlinky.unist.mod.Node | scala.Unit]) | scala.Unit
  ]
}
