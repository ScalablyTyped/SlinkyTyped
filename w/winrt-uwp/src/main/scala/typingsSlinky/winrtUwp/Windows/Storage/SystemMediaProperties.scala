package typingsSlinky.winrtUwp.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A helper object that provides indexing names for Windows media file properties. */
@js.native
trait SystemMediaProperties extends js.Object {
  /** Gets the name of the System.Media.Duration property (one of the Windows media file properties). */
  var duration: String = js.native
  /** Gets the name of the System.Media.Producer property (one of the Windows media file properties). */
  var producer: String = js.native
  /** Gets the name of the System.Media.Publisher property (one of the Windows media file properties). */
  var publisher: String = js.native
  /** Gets the name of the System.Media.SubTitle property (one of the Windows media file properties). */
  var subTitle: String = js.native
  /** Gets the name of the System.Media.Writer property (one of the Windows media file properties). */
  var writer: String = js.native
  /** Gets the name of the System.Media.Year property (one of the Windows media file properties). */
  var year: String = js.native
}

object SystemMediaProperties {
  @scala.inline
  def apply(
    duration: String,
    producer: String,
    publisher: String,
    subTitle: String,
    writer: String,
    year: String
  ): SystemMediaProperties = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], producer = producer.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], subTitle = subTitle.asInstanceOf[js.Any], writer = writer.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemMediaProperties]
  }
  @scala.inline
  implicit class SystemMediaPropertiesOps[Self <: SystemMediaProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProducer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("producer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublisher(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWriter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYear(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("year")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

