package typingsSlinky.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "InnerSubscription")
@js.native
class InnerSubscription protected ()
  extends typingsSlinky.wonderFrp.innerSubscriptionMod.InnerSubscription {
  def this(
    subject: typingsSlinky.wonderFrp.generatorSubjectMod.GeneratorSubject,
    observer: typingsSlinky.wonderFrp.observerMod.Observer
  ) = this()
  def this(
    subject: typingsSlinky.wonderFrp.subjectMod.Subject,
    observer: typingsSlinky.wonderFrp.observerMod.Observer
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "InnerSubscription")
@js.native
object InnerSubscription extends js.Object {
  def create(
    subject: typingsSlinky.wonderFrp.generatorSubjectMod.GeneratorSubject,
    observer: typingsSlinky.wonderFrp.observerMod.Observer
  ): typingsSlinky.wonderFrp.innerSubscriptionMod.InnerSubscription = js.native
  def create(
    subject: typingsSlinky.wonderFrp.subjectMod.Subject,
    observer: typingsSlinky.wonderFrp.observerMod.Observer
  ): typingsSlinky.wonderFrp.innerSubscriptionMod.InnerSubscription = js.native
}

