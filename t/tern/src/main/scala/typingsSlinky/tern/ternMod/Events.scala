package typingsSlinky.tern.ternMod

import typingsSlinky.estree.mod.Node
import typingsSlinky.estree.mod.Program
import typingsSlinky.tern.inferMod.Scope
import typingsSlinky.tern.inferMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Events extends js.Object {
  /** After analyzing a file. */
  def afterLoad(file: File): Unit = js.native
  /** Before analyzing a file. file is an object holding {name, text, scope} properties. */
  def beforeLoad(file: File): Unit = js.native
  /** Run at the start of a completion query. May return a valid completion result to replace the default completion algorithm. */
  def completion(file: File, query: CompletionsQuery): CompletionsQueryResult | Unit = js.native
  /** Run after the type inference pass. */
  def postInfer(ast: Program, scope: Scope): Unit = js.native
  /** Run right after a file is parsed, and passed the parse tree and the parsed file as arguments. */
  def postParse(ast: Program, text: String): Unit = js.native
  /** Run right before the type inference pass, passing the syntax tree and a scope object. */
  def preInfer(ast: Program, scope: Scope): Unit = js.native
  /**
    * Will be run right before a file is parsed, and passed the given text and options. If a handler
    * returns a new text value, the origin text will be overriden. This is useful for
    * instance when a plugin is able to extract JavaScript content from an HTML file.
    */
  def preParse(text: String, options: js.Object): String | Unit = js.native
  /** When the server throws away its current analysis data and starts a fresh run. */
  def reset(): Unit = js.native
  /**
    * Run after Tern attempts to find the type at the position end in the given file.
    * A handler may return either the given type (already calculated by Tern and earlier "typeAt" passes)
    * or an alternate type to be used instead. This is useful when
    * a plugin can provide a more helpful type than Tern (e.g. within comments).
    */
  def typeAt(file: File, end: Position, expr: Node, `type`: Type): Type | Unit = js.native
}

object Events {
  @scala.inline
  def apply(
    afterLoad: File => Unit,
    beforeLoad: File => Unit,
    completion: (File, CompletionsQuery) => CompletionsQueryResult | Unit,
    postInfer: (Program, Scope) => Unit,
    postParse: (Program, String) => Unit,
    preInfer: (Program, Scope) => Unit,
    preParse: (String, js.Object) => String | Unit,
    reset: () => Unit,
    typeAt: (File, Position, Node, Type) => Type | Unit
  ): Events = {
    val __obj = js.Dynamic.literal(afterLoad = js.Any.fromFunction1(afterLoad), beforeLoad = js.Any.fromFunction1(beforeLoad), completion = js.Any.fromFunction2(completion), postInfer = js.Any.fromFunction2(postInfer), postParse = js.Any.fromFunction2(postParse), preInfer = js.Any.fromFunction2(preInfer), preParse = js.Any.fromFunction2(preParse), reset = js.Any.fromFunction0(reset), typeAt = js.Any.fromFunction4(typeAt))
    __obj.asInstanceOf[Events]
  }
  @scala.inline
  implicit class EventsOps[Self <: Events] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterLoad(value: File => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBeforeLoad(value: File => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCompletion(value: (File, CompletionsQuery) => CompletionsQueryResult | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completion")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPostInfer(value: (Program, Scope) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postInfer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPostParse(value: (Program, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postParse")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPreInfer(value: (Program, Scope) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preInfer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPreParse(value: (String, js.Object) => String | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preParse")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTypeAt(value: (File, Position, Node, Type) => Type | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeAt")(js.Any.fromFunction4(value))
        ret
    }
  }
  
}

