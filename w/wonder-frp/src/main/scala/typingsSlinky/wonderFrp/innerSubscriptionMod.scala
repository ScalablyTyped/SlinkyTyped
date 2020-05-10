package typingsSlinky.wonderFrp

import typingsSlinky.wonderFrp.generatorSubjectMod.GeneratorSubject
import typingsSlinky.wonderFrp.idisposableMod.IDisposable
import typingsSlinky.wonderFrp.observerMod.Observer
import typingsSlinky.wonderFrp.subjectMod.Subject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/Disposable/InnerSubscription", JSImport.Namespace)
@js.native
object innerSubscriptionMod extends js.Object {
  @js.native
  class InnerSubscription protected () extends IDisposable {
    def this(subject: GeneratorSubject, observer: Observer) = this()
    def this(subject: Subject, observer: Observer) = this()
    var _observer: js.Any = js.native
    var _subject: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object InnerSubscription extends js.Object {
    def create(subject: GeneratorSubject, observer: Observer): InnerSubscription = js.native
    def create(subject: Subject, observer: Observer): InnerSubscription = js.native
  }
  
}

