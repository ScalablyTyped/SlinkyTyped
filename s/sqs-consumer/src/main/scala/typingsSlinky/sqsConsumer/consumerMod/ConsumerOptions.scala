package typingsSlinky.sqsConsumer.consumerMod

import typingsSlinky.awsSdk.sqsMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConsumerOptions extends js.Object {
  var attributeNames: js.UndefOr[js.Array[String]] = js.native
  var authenticationErrorTimeout: js.UndefOr[Double] = js.native
  var batchSize: js.UndefOr[Double] = js.native
  var handleMessage: js.UndefOr[js.Function1[/* message */ SQSMessage, js.Promise[Unit]]] = js.native
  var handleMessageBatch: js.UndefOr[js.Function1[/* messages */ js.Array[SQSMessage], js.Promise[Unit]]] = js.native
  var handleMessageTimeout: js.UndefOr[Double] = js.native
  var messageAttributeNames: js.UndefOr[js.Array[String]] = js.native
  var pollingWaitTimeMs: js.UndefOr[Double] = js.native
  var queueUrl: js.UndefOr[String] = js.native
  var region: js.UndefOr[String] = js.native
  var sqs: js.UndefOr[^] = js.native
  var stopped: js.UndefOr[Boolean] = js.native
  var terminateVisibilityTimeout: js.UndefOr[Boolean] = js.native
  var visibilityTimeout: js.UndefOr[Double] = js.native
  var waitTimeSeconds: js.UndefOr[Double] = js.native
}

object ConsumerOptions {
  @scala.inline
  def apply(): ConsumerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsumerOptions]
  }
  @scala.inline
  implicit class ConsumerOptionsOps[Self <: ConsumerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeNames")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthenticationErrorTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticationErrorTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthenticationErrorTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticationErrorTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withBatchSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchSize")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleMessage(value: /* message */ SQSMessage => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHandleMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleMessageBatch(value: /* messages */ js.Array[SQSMessage] => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleMessageBatch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHandleMessageBatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleMessageBatch")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleMessageTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleMessageTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleMessageTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleMessageTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageAttributeNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageAttributeNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageAttributeNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageAttributeNames")(js.undefined)
        ret
    }
    @scala.inline
    def withPollingWaitTimeMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollingWaitTimeMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPollingWaitTimeMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollingWaitTimeMs")(js.undefined)
        ret
    }
    @scala.inline
    def withQueueUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueueUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
    @scala.inline
    def withSqs(value: ^): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sqs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSqs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sqs")(js.undefined)
        ret
    }
    @scala.inline
    def withStopped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopped")(js.undefined)
        ret
    }
    @scala.inline
    def withTerminateVisibilityTimeout(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminateVisibilityTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerminateVisibilityTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminateVisibilityTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibilityTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibilityTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibilityTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibilityTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitTimeSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitTimeSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitTimeSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitTimeSeconds")(js.undefined)
        ret
    }
  }
  
}

