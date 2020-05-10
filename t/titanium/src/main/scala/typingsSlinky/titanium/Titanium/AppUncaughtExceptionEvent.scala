package typingsSlinky.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Fired when an uncaught JavaScript exception occurs.
	 */
@js.native
trait AppUncaughtExceptionEvent extends AppBaseEvent {
  /**
  		 * The column offset on the line where the error occured.
  		 */
  var column: Double = js.native
  /**
  		 * The java stack trace of the exception.
  		 * @deprecated Use `nativeStack` property for cross-platform parity.
  		 */
  var javaStack: String = js.native
  /**
  		 * The javascript stack trace of the exception.
  		 * @deprecated Use `stack` property for cross-platform parity.
  		 */
  var jsStack: String = js.native
  /**
  		 * The line where the error occurred.
  		 */
  var line: Double = js.native
  /**
  		 * The offset on the line where the error occurred.
  		 * @deprecated Use `column` property for cross-platform parity.
  		 */
  var lineOffset: Double = js.native
  /**
  		 * The line source reference.
  		 */
  var lineSource: String = js.native
  /**
  		 * The error message.
  		 */
  var message: String = js.native
  /**
  		 * The native platform stack trace of the exception.
  		 */
  var nativeStack: String = js.native
  /**
  		 * A unique identification for the source file.
  		 */
  var sourceId: Double = js.native
  /**
  		 * The name of the source file.
  		 */
  var sourceName: String = js.native
  /**
  		 * The URL to the source file.
  		 */
  var sourceURL: String = js.native
  /**
  		 * The javascript stack trace of the exception.
  		 */
  var stack: String = js.native
  /**
  		 * The title for the error.
  		 */
  var title: String = js.native
  /**
  		 * The type of error.
  		 */
  var `type`: String = js.native
}

object AppUncaughtExceptionEvent {
  @scala.inline
  def apply(
    column: Double,
    javaStack: String,
    jsStack: String,
    line: Double,
    lineOffset: Double,
    lineSource: String,
    message: String,
    nativeStack: String,
    source: App,
    sourceId: Double,
    sourceName: String,
    sourceURL: String,
    stack: String,
    title: String,
    `type`: String
  ): AppUncaughtExceptionEvent = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], javaStack = javaStack.asInstanceOf[js.Any], jsStack = jsStack.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], lineOffset = lineOffset.asInstanceOf[js.Any], lineSource = lineSource.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], nativeStack = nativeStack.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any], sourceName = sourceName.asInstanceOf[js.Any], sourceURL = sourceURL.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppUncaughtExceptionEvent]
  }
  @scala.inline
  implicit class AppUncaughtExceptionEventOps[Self <: AppUncaughtExceptionEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJavaStack(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("javaStack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJsStack(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsStack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNativeStack(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeStack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStack(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

