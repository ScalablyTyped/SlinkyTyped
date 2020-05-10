package typingsSlinky.transducersJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompletingTransformer[TResult, TCompleteResult, TInput] extends js.Object {
  @JSName("@@transducer/init")
  def `@@transducerSlashinit`(): TResult | Unit = js.native
  @JSName("@@transducer/result")
  def `@@transducerSlashresult`(result: TResult): TCompleteResult = js.native
  @JSName("@@transducer/step")
  def `@@transducerSlashstep`(result: TResult, input: TInput): TResult | Reduced[TResult] = js.native
}

object CompletingTransformer {
  @scala.inline
  def apply[TResult, TCompleteResult, TInput](
    `@@transducerSlashinit`: () => TResult | Unit,
    `@@transducerSlashresult`: TResult => TCompleteResult,
    `@@transducerSlashstep`: (TResult, TInput) => TResult | Reduced[TResult]
  ): CompletingTransformer[TResult, TCompleteResult, TInput] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("@@transducer/init")(js.Any.fromFunction0(`@@transducerSlashinit`))
    __obj.updateDynamic("@@transducer/result")(js.Any.fromFunction1(`@@transducerSlashresult`))
    __obj.updateDynamic("@@transducer/step")(js.Any.fromFunction2(`@@transducerSlashstep`))
    __obj.asInstanceOf[CompletingTransformer[TResult, TCompleteResult, TInput]]
  }
  @scala.inline
  implicit class CompletingTransformerOps[Self[tresult, tcompleteresult, tinput] <: CompletingTransformer[tresult, tcompleteresult, tinput], TResult, TCompleteResult, TInput] (val x: Self[TResult, TCompleteResult, TInput]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TResult, TCompleteResult, TInput] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TResult, TCompleteResult, TInput]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TResult, TCompleteResult, TInput]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TResult, TCompleteResult, TInput]) with Other]
    @scala.inline
    def `with@@transducerSlashinit`(value: () => TResult | Unit): Self[TResult, TCompleteResult, TInput] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("@@transducer/init")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def `with@@transducerSlashresult`(value: TResult => TCompleteResult): Self[TResult, TCompleteResult, TInput] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("@@transducer/result")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `with@@transducerSlashstep`(value: (TResult, TInput) => TResult | Reduced[TResult]): Self[TResult, TCompleteResult, TInput] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("@@transducer/step")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

