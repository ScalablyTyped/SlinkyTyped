package typingsSlinky.tensorflowTfjsConverter.compiledApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVersionDef extends js.Object {
  /** VersionDef badConsumers */
  var badConsumers: js.UndefOr[js.Array[Double] | Null] = js.native
  /** VersionDef minConsumer */
  var minConsumer: js.UndefOr[Double | Null] = js.native
  /** VersionDef producer */
  var producer: js.UndefOr[Double | Null] = js.native
}

object IVersionDef {
  @scala.inline
  def apply(): IVersionDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IVersionDef]
  }
  @scala.inline
  implicit class IVersionDefOps[Self <: IVersionDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBadConsumers(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badConsumers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBadConsumers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badConsumers")(js.undefined)
        ret
    }
    @scala.inline
    def withBadConsumersNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badConsumers")(null)
        ret
    }
    @scala.inline
    def withMinConsumer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minConsumer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinConsumer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minConsumer")(js.undefined)
        ret
    }
    @scala.inline
    def withMinConsumerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minConsumer")(null)
        ret
    }
    @scala.inline
    def withProducer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("producer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProducer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("producer")(js.undefined)
        ret
    }
    @scala.inline
    def withProducerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("producer")(null)
        ret
    }
  }
  
}

