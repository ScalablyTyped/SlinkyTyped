package typingsSlinky.wonderFrp.es2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "InnerSubscription")
@js.native
class InnerSubscription protected ()
  extends typingsSlinky.wonderFrp.disposableInnerSubscriptionMod.InnerSubscription {
  def this(
    subject: typingsSlinky.wonderFrp.subjectGeneratorSubjectMod.GeneratorSubject,
    observer: typingsSlinky.wonderFrp.coreObserverMod.Observer
  ) = this()
  def this(
    subject: typingsSlinky.wonderFrp.subjectSubjectMod.Subject,
    observer: typingsSlinky.wonderFrp.coreObserverMod.Observer
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "InnerSubscription")
@js.native
object InnerSubscription extends js.Object {
  def create(
    subject: typingsSlinky.wonderFrp.subjectGeneratorSubjectMod.GeneratorSubject,
    observer: typingsSlinky.wonderFrp.coreObserverMod.Observer
  ): typingsSlinky.wonderFrp.disposableInnerSubscriptionMod.InnerSubscription = js.native
  def create(
    subject: typingsSlinky.wonderFrp.subjectSubjectMod.Subject,
    observer: typingsSlinky.wonderFrp.coreObserverMod.Observer
  ): typingsSlinky.wonderFrp.disposableInnerSubscriptionMod.InnerSubscription = js.native
}

