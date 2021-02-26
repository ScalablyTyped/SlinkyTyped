package typingsSlinky.vfileMessage

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Error
import typingsSlinky.unist.mod.Node
import typingsSlinky.unist.mod.Point
import typingsSlinky.unist.mod.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("vfile-message", JSImport.Namespace)
  @js.native
  class ^ protected () extends VFileMessage {
    /**
      * Constructor of a message for `reason` at `position` from `origin`.
      * When an error is passed in as `reason`, copies the `stack`.
      *
      * @param reason Reason for message (`string` or `Error`). Uses the stack and message of the error if given.
      * @param position Place at which the message occurred in a file (`Node`, `Position`, or `Point`, optional).
      * @param origin Place in code the message originates from (`string`, optional).
      */
    def this(reason: String) = this()
    def this(reason: js.Error) = this()
    def this(reason: String, position: Node) = this()
    def this(reason: String, position: Point) = this()
    def this(reason: String, position: Position) = this()
    def this(reason: js.Error, position: Node) = this()
    def this(reason: js.Error, position: Point) = this()
    def this(reason: js.Error, position: Position) = this()
    def this(reason: String, position: js.UndefOr[scala.Nothing], origin: String) = this()
    def this(reason: String, position: Node, origin: String) = this()
    def this(reason: String, position: Point, origin: String) = this()
    def this(reason: String, position: Position, origin: String) = this()
    def this(reason: js.Error, position: js.UndefOr[scala.Nothing], origin: String) = this()
    def this(reason: js.Error, position: Node, origin: String) = this()
    def this(reason: js.Error, position: Point, origin: String) = this()
    def this(reason: js.Error, position: Position, origin: String) = this()
  }
  @JSImport("vfile-message", JSImport.Namespace)
  @js.native
  val ^ : VFileMessage = js.native
  
  /**
    * Create a virtual message.
    */
  @js.native
  trait VFileMessage
    extends Error
       with /**
    * It’s OK to store custom data directly on the VMessage, some of those are handled by utilities.
    */
  /* key */ StringDictionary[js.Any]
       with /**
    * Constructor of a message for `reason` at `position` from `origin`.
    * When an error is passed in as `reason`, copies the `stack`.
    *
    * @param reason Reason for message (`string` or `Error`). Uses the stack and message of the error if given.
    * @param position Place at which the message occurred in a file (`Node`, `Position`, or `Point`, optional).
    * @param origin Place in code the message originates from (`string`, optional).
    */
  Instantiable1[(/* reason */ js.Error) | (/* reason */ String), VFileMessage]
       with Instantiable2[
          (/* reason */ js.Error) | (/* reason */ String), 
          (/* position */ Node) | (/* position */ Point) | (/* position */ Position), 
          VFileMessage
        ]
       with Instantiable3[
          (/* reason */ js.Error) | (/* reason */ String), 
          js.UndefOr[(/* position */ Node) | (/* position */ Point) | (/* position */ Position)], 
          /* origin */ String, 
          VFileMessage
        ] {
    
    /**
      * Constructor of a message for `reason` at `position` from `origin`.
      * When an error is passed in as `reason`, copies the `stack`.
      *
      * @param reason Reason for message (`string` or `Error`). Uses the stack and message of the error if given.
      * @param position Place at which the message occurred in a file (`Node`, `Position`, or `Point`, optional).
      * @param origin Place in code the message originates from (`string`, optional).
      */
    def apply(reason: String): VFileMessage = js.native
    def apply(reason: String, position: js.UndefOr[scala.Nothing], origin: String): VFileMessage = js.native
    def apply(reason: String, position: Node): VFileMessage = js.native
    def apply(reason: String, position: Node, origin: String): VFileMessage = js.native
    def apply(reason: String, position: Point): VFileMessage = js.native
    def apply(reason: String, position: Point, origin: String): VFileMessage = js.native
    def apply(reason: String, position: Position): VFileMessage = js.native
    def apply(reason: String, position: Position, origin: String): VFileMessage = js.native
    def apply(reason: js.Error): VFileMessage = js.native
    def apply(reason: js.Error, position: js.UndefOr[scala.Nothing], origin: String): VFileMessage = js.native
    def apply(reason: js.Error, position: Node): VFileMessage = js.native
    def apply(reason: js.Error, position: Node, origin: String): VFileMessage = js.native
    def apply(reason: js.Error, position: Point): VFileMessage = js.native
    def apply(reason: js.Error, position: Point, origin: String): VFileMessage = js.native
    def apply(reason: js.Error, position: Position): VFileMessage = js.native
    def apply(reason: js.Error, position: Position, origin: String): VFileMessage = js.native
    
    /**
      * Starting column of error.
      */
    var column: Double | Null = js.native
    
    /**
      * If true, marks associated file as no longer processable.
      */
    var fatal: js.UndefOr[Boolean | Null] = js.native
    
    /**
      * You may add a file property with a path of a file (used throughout the VFile ecosystem).
      */
    var file: js.UndefOr[String] = js.native
    
    /**
      * Starting line of error.
      */
    var line: Double | Null = js.native
    
    /**
      * Full range information, when available.
      * Has start and end properties, both set to an object with line and column, set to number?.
      */
    var location: Position = js.native
    
    /**
      * You may add a note property with a long form description of the message (supported by vfile-reporter).
      */
    var note: js.UndefOr[String] = js.native
    
    /**
      * Reason for message.
      */
    var reason: String = js.native
    
    /**
      * Category of message.
      */
    var ruleId: String | Null = js.native
    
    /**
      * Namespace of warning.
      */
    var source: String | Null = js.native
    
    /**
      * You may add a url property with a link to documentation for the message.
      */
    var url: js.UndefOr[String] = js.native
  }
  
  type _To = VFileMessage
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: VFileMessage = ^
}
