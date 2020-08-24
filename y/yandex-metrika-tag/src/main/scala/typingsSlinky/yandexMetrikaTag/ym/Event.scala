package typingsSlinky.yandexMetrikaTag.ym

import typingsSlinky.yandexMetrikaTag.yandexMetrikaTagStrings.addFileExtension
import typingsSlinky.yandexMetrikaTag.yandexMetrikaTagStrings.extLink
import typingsSlinky.yandexMetrikaTag.yandexMetrikaTagStrings.file
import typingsSlinky.yandexMetrikaTag.yandexMetrikaTagStrings.getClientID
import typingsSlinky.yandexMetrikaTag.yandexMetrikaTagStrings.hit
import typingsSlinky.yandexMetrikaTag.yandexMetrikaTagStrings.init
import typingsSlinky.yandexMetrikaTag.yandexMetrikaTagStrings.notBounce
import typingsSlinky.yandexMetrikaTag.yandexMetrikaTagStrings.params
import typingsSlinky.yandexMetrikaTag.yandexMetrikaTagStrings.reachGoal
import typingsSlinky.yandexMetrikaTag.yandexMetrikaTagStrings.replacePhones
import typingsSlinky.yandexMetrikaTag.yandexMetrikaTagStrings.setUserID
import typingsSlinky.yandexMetrikaTag.yandexMetrikaTagStrings.userParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event extends js.Object {
  def apply(counterId: Double, eventName: addFileExtension, extensions: String): Unit = js.native
  def apply(counterId: Double, eventName: addFileExtension, extensions: js.Array[String]): Unit = js.native
  def apply(counterId: Double, eventName: getClientID, cb: js.Function1[/* clientID */ String, Unit]): Unit = js.native
  /** @deprecated */
  def apply(counterId: Double, eventName: hit, url: String): Unit = js.native
  def apply(
    counterId: Double,
    eventName: hit,
    url: String,
    title: js.UndefOr[scala.Nothing],
    referer: js.UndefOr[scala.Nothing],
    params: VisitParameters
  ): Unit = js.native
  def apply(counterId: Double, eventName: hit, url: String, title: js.UndefOr[scala.Nothing], referer: String): Unit = js.native
  def apply(
    counterId: Double,
    eventName: hit,
    url: String,
    title: js.UndefOr[scala.Nothing],
    referer: String,
    params: VisitParameters
  ): Unit = js.native
  def apply(counterId: Double, eventName: hit, url: String, title: String): Unit = js.native
  def apply(
    counterId: Double,
    eventName: hit,
    url: String,
    title: String,
    referer: js.UndefOr[scala.Nothing],
    params: VisitParameters
  ): Unit = js.native
  def apply(counterId: Double, eventName: hit, url: String, title: String, referer: String): Unit = js.native
  def apply(
    counterId: Double,
    eventName: hit,
    url: String,
    title: String,
    referer: String,
    params: VisitParameters
  ): Unit = js.native
  def apply(counterId: Double, eventName: init, parameters: InitParameters): Unit = js.native
  def apply(counterId: Double, eventName: params, parameters: js.Array[VisitParameters]): Unit = js.native
  def apply(counterId: Double, eventName: params, parameters: VisitParameters): Unit = js.native
  def apply(counterId: Double, eventName: replacePhones): Unit = js.native
  def apply(counterId: Double, eventName: setUserID, userID: String): Unit = js.native
  def apply(counterId: Double, eventName: userParams, parameters: UserParameters): Unit = js.native
  // tslint:disable-next-line no-unnecessary-generics
  def apply[CTX](counterId: Double, eventName: extLink, url: String): Unit = js.native
  def apply[CTX](counterId: Double, eventName: extLink, url: String, options: ExtLinkOptions[CTX]): Unit = js.native
  // tslint:disable-next-line no-unnecessary-generics
  def apply[CTX](counterId: Double, eventName: file, url: String): Unit = js.native
  def apply[CTX](counterId: Double, eventName: file, url: String, options: FileOptions[CTX]): Unit = js.native
  def apply[CTX](counterId: Double, eventName: hit, url: String, options: HitOptions[CTX]): Unit = js.native
  // tslint:disable-next-line no-unnecessary-generics
  def apply[CTX](counterId: Double, eventName: notBounce): Unit = js.native
  def apply[CTX](counterId: Double, eventName: notBounce, options: NotBounceOptions[CTX]): Unit = js.native
  // tslint:disable-next-line no-unnecessary-generics
  def apply[CTX](counterId: Double, eventName: reachGoal, target: String): Unit = js.native
  def apply[CTX](
    counterId: Double,
    eventName: reachGoal,
    target: String,
    params: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    ctx: CTX
  ): Unit = js.native
  def apply[CTX](
    counterId: Double,
    eventName: reachGoal,
    target: String,
    params: js.UndefOr[scala.Nothing],
    callback: js.ThisFunction0[/* this */ CTX, Unit]
  ): Unit = js.native
  def apply[CTX](
    counterId: Double,
    eventName: reachGoal,
    target: String,
    params: js.UndefOr[scala.Nothing],
    callback: js.ThisFunction0[/* this */ CTX, Unit],
    ctx: CTX
  ): Unit = js.native
  def apply[CTX](counterId: Double, eventName: reachGoal, target: String, params: VisitParameters): Unit = js.native
  def apply[CTX](
    counterId: Double,
    eventName: reachGoal,
    target: String,
    params: VisitParameters,
    callback: js.UndefOr[scala.Nothing],
    ctx: CTX
  ): Unit = js.native
  def apply[CTX](
    counterId: Double,
    eventName: reachGoal,
    target: String,
    params: VisitParameters,
    callback: js.ThisFunction0[/* this */ CTX, Unit]
  ): Unit = js.native
  def apply[CTX](
    counterId: Double,
    eventName: reachGoal,
    target: String,
    params: VisitParameters,
    callback: js.ThisFunction0[/* this */ CTX, Unit],
    ctx: CTX
  ): Unit = js.native
}

