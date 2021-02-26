package typingsSlinky.serverTimingHeader

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Express middleware add serverTiming to request and
    * make sure that we will send this headers before express finish request
    * @example <caption>How to add middleware</caption>
    * import express = require('express');
    * import serverTimingMiddleware = require('server-timing-header');
    * const port = 3000;
    * const app = express();
    * app.use(serverTimingMiddleware());
    * app.get('/', function (req, res, next) {
    *   req.serverTiming.from('db');
    *   // fetching data from database
    *   req.serverTiming.to('db');
    * });
    * app.listen(port, () => console.log(`Example app listening on port ${port}!`));
    */
  @JSImport("server-timing-header", JSImport.Namespace)
  @js.native
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("server-timing-header", JSImport.Namespace)
  @js.native
  def apply(options: Options): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  @JSImport("server-timing-header", "ServerTiming")
  @js.native
  class ServerTiming protected () extends StObject {
    /**
      * Create server timing controller
      * @param [userAgent=''] — string that contain user agent description
      * @param [sendHeaders=true] - you may send or don't send headers depending on environment
      */
    def this(userAgent: String, sendHeaders: Boolean) = this()
    
    /**
      * Add metric
      * @param name - metric name
      * @param description — metric description
      * @param duration — metric duration
      * @throw {Error} — throw an error if name contains invalid characters
      * @example <caption>Add metric</caption>
      * import express = require('express');
      * import serverTimingMiddleware = require('server-timing-header');
      * const port = 3000;
      * const app = express();
      * app.use(serverTimingMiddleware());
      * app.get('/', function (req, res, next) {
      *   // You got time metric from the external source
      *   req.serverTiming.add('metric', 'metric description', 52.3);
      * });
      * app.listen(port, () => console.log(`Example app listening on port ${port}!`));
      */
    def add(name: String, description: String, duration: Double): Unit = js.native
    
    /**
      * Add callback to modify data before create and send headers
      * @param name — hook name
      * @param callback — function that may modify data before send headers
      * @param callbackIndex - index that will be used to sort callbacks before execution
      * @example <caption>Add hook to mutate the metrics</caption>
      * import express = require('express');
      * import serverTimingMiddleware = require('server-timing-header');
      * const port = 3000;
      * const app = express();
      * app.use(serverTimingMiddleware());
      * app.use(function (req, res, next) {
      *   // If one measurement include other inside you may substract times
      *   req.serverTiming.addHook('substractDataTimeFromRenderTime', function (metrics) {
      *      const updated = { ...metrics };
      *      if (updated.data && updated.render) {
      *        const renderDuration  = req.serverTiming.calculateDurationSmart(updated.render);
      *        const dataDuration  = req.serverTiming.calculateDurationSmart(updated.data);
      *        updated.render.duration = Math.abs(renderDuration - dataDuration);
      *      }
      *      return updated;
      *   });
      * });
      * app.listen(port, () => console.log(`Example app listening on port ${port}!`));
      */
    def addHook(name: String, callback: js.Function1[/* metrics */ Metrics, Unit]): Unit = js.native
    def addHook(name: String, callback: js.Function1[/* metrics */ Metrics, Unit], callbackIndex: Double): Unit = js.native
    
    /**
      * Calculate duration between two timestamps, if from or two is undefined — will use initialization time and current time to replace
      * @param metric — object that contain metric information
      * @return - duration in milliseconds
      */
    def calculateDurationSmart(metric: Metric): Double = js.native
    
    /**
      * Add description to specific metric
      * @param name — metric name
      * @param description — description of the metric
      * @throw {Error} — throw an error if name is not valid
      */
    def description(name: String, description: String): Unit = js.native
    
    /**
      * Add duration to specific metric
      * @param name — metric name
      * @param duration — duration of the metric
      * @throw {Error} — throw an error if name is not valid
      */
    def duration(name: String, duration: Double): Unit = js.native
    
    /**
      * Set start time for metric
      * @param name — metric name
      * @param [description] — description of the metric
      * @throw {Error} throw an error if name is not valid
      * @example <caption>You may define only start time for metric</caption>
      * import express = require('express');
      * import serverTimingMiddleware = require('server-timing-header');
      * const port = 3000;
      * const app = express();
      * app.use(serverTimingMiddleware());
      * app.get('/', function (req, res, next) {
      *   // If you define only start time for metric,
      *   // then as the end time will be used header sent time
      *   req.serverTiming.from('metric', 'metric description');
      *   // fetching data from database
      * });
      * app.listen(port, () => console.log(`Example app listening on port ${port}!`));
      */
    def from(name: String): Unit = js.native
    def from(name: String, description: String): Unit = js.native
    
    val oldSpecification: Boolean = js.native
    
    /**
      * Remove callback with specific name
      * @param name — hook name
      */
    def removeHook(name: String): Unit = js.native
    
    /**
      * Set end time for metric
      * @param name — metric name
      * @param [description] — description of the metric
      * @throw {Error} — throw an error if name is not valid
      * @example <caption>You may define only end time for metric</caption>
      * import express = require('express');
      * import serverTimingMiddleware = require('server-timing-header');
      * const port = 3000;
      * const app = express();
      * app.use(serverTimingMiddleware());
      * app.get('/', function (req, res, next) {
      *   // fetching data from database
      *   // If you define only end time for metric,
      *   // then as the start time will be used middleware initialization time
      *   req.serverTiming.to('metric');
      * });
      * app.listen(port, () => console.log(`Example app listening on port ${port}!`));
      */
    def to(name: String): Unit = js.native
    def to(name: String, description: String): Unit = js.native
  }
  object ServerTiming {
    
    /**
      * Build server-timing header value by current specification
      * @param name - metric name
      * @param description - metric description
      * @param duration - metric duration
      * @return — server-timing header value
      */
    /* static member */
    @JSImport("server-timing-header", "ServerTiming.newStyle")
    @js.native
    def newStyle(name: String, description: String, duration: String): String = js.native
    
    /**
      * Build server-timing header value by old specification
      * @param name - metric name
      * @param description - metric description
      * @param duration - metric duration
      * @return — server-timing header value
      */
    /* static member */
    @JSImport("server-timing-header", "ServerTiming.oldStyle")
    @js.native
    def oldStyle(name: String, description: String, duration: String): String = js.native
  }
  
  /**
    * object that contain metric information
    */
  @js.native
  trait Metric extends StObject {
    
    /** metric description */
    var description: String = js.native
    
    /** time in milliseconds, if not undefined method will just return durations */
    var duration: Double = js.native
    
    /** start time [seconds, nanoseconds], if undefined, initialization time will be used */
    var from: js.Tuple2[Double, Double] = js.native
    
    /** metric name */
    var name: String = js.native
    
    /**  end time [seconds, nanoseconds], if undefined, current timestamp will be used */
    var to: js.Tuple2[Double, Double] = js.native
  }
  object Metric {
    
    @scala.inline
    def apply(
      description: String,
      duration: Double,
      from: js.Tuple2[Double, Double],
      name: String,
      to: js.Tuple2[Double, Double]
    ): Metric = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[Metric]
    }
    
    @scala.inline
    implicit class MetricMutableBuilder[Self <: Metric] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrom(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Object with hashed metrics information
    */
  type Metrics = StringDictionary[Metric]
  
  /**
    * middleware options
    */
  @js.native
  trait Options extends StObject {
    
    /**
      * should middleware send headers (may be disabled for some environments
      * @default false
      */
    var sendHeaders: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSendHeaders(value: Boolean): Self = StObject.set(x, "sendHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSendHeadersUndefined: Self = StObject.set(x, "sendHeaders", js.undefined)
    }
  }
  
  object expressServeStaticCoreAugmentingMod {
    
    @js.native
    trait Request extends StObject {
      
      val serverTiming: ServerTiming = js.native
    }
    object Request {
      
      @scala.inline
      def apply(serverTiming: ServerTiming): Request = {
        val __obj = js.Dynamic.literal(serverTiming = serverTiming.asInstanceOf[js.Any])
        __obj.asInstanceOf[Request]
      }
      
      @scala.inline
      implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setServerTiming(value: ServerTiming): Self = StObject.set(x, "serverTiming", value.asInstanceOf[js.Any])
      }
    }
  }
}
