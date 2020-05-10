package typingsSlinky.tslint.formatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFormatterMetadata extends js.Object {
  /**
    * Sample output from the formatter.
    */
  var consumer: ConsumerType = js.native
  /**
    * A short, one line description of what the formatter does.
    */
  var description: String = js.native
  /**
    * More elaborate details about the formatter.
    */
  var descriptionDetails: js.UndefOr[String] = js.native
  /**
    * The name of the formatter.
    */
  var formatterName: String = js.native
  /**
    * Sample output from the formatter.
    */
  var sample: String = js.native
}

object IFormatterMetadata {
  @scala.inline
  def apply(consumer: ConsumerType, description: String, formatterName: String, sample: String): IFormatterMetadata = {
    val __obj = js.Dynamic.literal(consumer = consumer.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], formatterName = formatterName.asInstanceOf[js.Any], sample = sample.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFormatterMetadata]
  }
  @scala.inline
  implicit class IFormatterMetadataOps[Self <: IFormatterMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsumer(value: ConsumerType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormatterName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSample(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sample")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescriptionDetails(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptionDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescriptionDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptionDetails")(js.undefined)
        ret
    }
  }
  
}

