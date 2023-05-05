/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.internal;

import org.jsoup.helper.Validate;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;

/**
 * A jsoup internal class (so don't use it as there is no contract API) that enables constraints on an Input Stream,
 * namely a maximum read size, and the ability to Thread.interrupt() the read.
 */
public final class ConstrainableInputStream extends BufferedInputStream {public static class __CLR4_4_12g32g3lh9yvgfy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255515475L,8589935092L,3247,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final int DefaultSize = 1024 * 32;

    private final boolean capped;
    private final int maxSize;
    private long startTime;
    private long timeout = 0; // optional max time of request
    private int remaining;
    private boolean interrupted;

    public ConstrainableInputStream(InputStream in, int bufferSize, int maxSize) {
        super(in, bufferSize);__CLR4_4_12g32g3lh9yvgfy.R.inc(3172);try{__CLR4_4_12g32g3lh9yvgfy.R.inc(3171);
        __CLR4_4_12g32g3lh9yvgfy.R.inc(3173);Validate.isTrue(maxSize >= 0);
        __CLR4_4_12g32g3lh9yvgfy.R.inc(3174);this.maxSize = maxSize;
        __CLR4_4_12g32g3lh9yvgfy.R.inc(3175);remaining = maxSize;
        __CLR4_4_12g32g3lh9yvgfy.R.inc(3176);capped = maxSize != 0;
        __CLR4_4_12g32g3lh9yvgfy.R.inc(3177);startTime = System.nanoTime();
    }finally{__CLR4_4_12g32g3lh9yvgfy.R.flushNeeded();}}

    /**
     * If this InputStream is not already a ConstrainableInputStream, let it be one.
     * @param in the input stream to (maybe) wrap
     * @param bufferSize the buffer size to use when reading
     * @param maxSize the maximum size to allow to be read. 0 == infinite.
     * @return a constrainable input stream
     */
    public static ConstrainableInputStream wrap(InputStream in, int bufferSize, int maxSize) {try{__CLR4_4_12g32g3lh9yvgfy.R.inc(3178);
        __CLR4_4_12g32g3lh9yvgfy.R.inc(3179);return (((in instanceof ConstrainableInputStream
            )&&(__CLR4_4_12g32g3lh9yvgfy.R.iget(3180)!=0|true))||(__CLR4_4_12g32g3lh9yvgfy.R.iget(3181)==0&false))? (ConstrainableInputStream) in
            : new ConstrainableInputStream(in, bufferSize, maxSize);
    }finally{__CLR4_4_12g32g3lh9yvgfy.R.flushNeeded();}}

    @Override
    public int read(byte[] b, int off, int len) throws IOException {try{__CLR4_4_12g32g3lh9yvgfy.R.inc(3182);
        __CLR4_4_12g32g3lh9yvgfy.R.inc(3183);if ((((interrupted || capped && remaining <= 0)&&(__CLR4_4_12g32g3lh9yvgfy.R.iget(3184)!=0|true))||(__CLR4_4_12g32g3lh9yvgfy.R.iget(3185)==0&false)))
            {__CLR4_4_12g32g3lh9yvgfy.R.inc(3186);return -1;
        }__CLR4_4_12g32g3lh9yvgfy.R.inc(3187);if ((((Thread.interrupted())&&(__CLR4_4_12g32g3lh9yvgfy.R.iget(3188)!=0|true))||(__CLR4_4_12g32g3lh9yvgfy.R.iget(3189)==0&false))) {{
            // interrupted latches, because parse() may call twice (and we still want the thread interupt to clear)
            __CLR4_4_12g32g3lh9yvgfy.R.inc(3190);interrupted = true;
            __CLR4_4_12g32g3lh9yvgfy.R.inc(3191);return -1;
        }
        }__CLR4_4_12g32g3lh9yvgfy.R.inc(3192);if ((((expired())&&(__CLR4_4_12g32g3lh9yvgfy.R.iget(3193)!=0|true))||(__CLR4_4_12g32g3lh9yvgfy.R.iget(3194)==0&false)))
            {__CLR4_4_12g32g3lh9yvgfy.R.inc(3195);throw new SocketTimeoutException("Read timeout");

        }__CLR4_4_12g32g3lh9yvgfy.R.inc(3196);if ((((capped && len > remaining)&&(__CLR4_4_12g32g3lh9yvgfy.R.iget(3197)!=0|true))||(__CLR4_4_12g32g3lh9yvgfy.R.iget(3198)==0&false)))
            {__CLR4_4_12g32g3lh9yvgfy.R.inc(3199);len = remaining; // don't read more than desired, even if available

        }__CLR4_4_12g32g3lh9yvgfy.R.inc(3200);try {
            __CLR4_4_12g32g3lh9yvgfy.R.inc(3201);final int read = super.read(b, off, len);
            __CLR4_4_12g32g3lh9yvgfy.R.inc(3202);remaining -= read;
            __CLR4_4_12g32g3lh9yvgfy.R.inc(3203);return read;
        } catch (SocketTimeoutException e) {
            __CLR4_4_12g32g3lh9yvgfy.R.inc(3204);return 0;
        }
    }finally{__CLR4_4_12g32g3lh9yvgfy.R.flushNeeded();}}

    /**
     * Reads this inputstream to a ByteBuffer. The supplied max may be less than the inputstream's max, to support
     * reading just the first bytes.
     */
    public ByteBuffer readToByteBuffer(int max) throws IOException {try{__CLR4_4_12g32g3lh9yvgfy.R.inc(3205);
        __CLR4_4_12g32g3lh9yvgfy.R.inc(3206);Validate.isTrue(max >= 0, "maxSize must be 0 (unlimited) or larger");
        __CLR4_4_12g32g3lh9yvgfy.R.inc(3207);final boolean localCapped = max > 0; // still possibly capped in total stream
        __CLR4_4_12g32g3lh9yvgfy.R.inc(3208);final int bufferSize = (((localCapped && max < DefaultSize )&&(__CLR4_4_12g32g3lh9yvgfy.R.iget(3209)!=0|true))||(__CLR4_4_12g32g3lh9yvgfy.R.iget(3210)==0&false))? max : DefaultSize;
        __CLR4_4_12g32g3lh9yvgfy.R.inc(3211);final byte[] readBuffer = new byte[bufferSize];
        __CLR4_4_12g32g3lh9yvgfy.R.inc(3212);final ByteArrayOutputStream outStream = new ByteArrayOutputStream(bufferSize);

        __CLR4_4_12g32g3lh9yvgfy.R.inc(3213);int read;
        __CLR4_4_12g32g3lh9yvgfy.R.inc(3214);int remaining = max;

        __CLR4_4_12g32g3lh9yvgfy.R.inc(3215);while (true) {{
            __CLR4_4_12g32g3lh9yvgfy.R.inc(3216);read = read(readBuffer);
            __CLR4_4_12g32g3lh9yvgfy.R.inc(3217);if ((((read == -1)&&(__CLR4_4_12g32g3lh9yvgfy.R.iget(3218)!=0|true))||(__CLR4_4_12g32g3lh9yvgfy.R.iget(3219)==0&false))) {__CLR4_4_12g32g3lh9yvgfy.R.inc(3220);break;
            }__CLR4_4_12g32g3lh9yvgfy.R.inc(3221);if ((((localCapped)&&(__CLR4_4_12g32g3lh9yvgfy.R.iget(3222)!=0|true))||(__CLR4_4_12g32g3lh9yvgfy.R.iget(3223)==0&false))) {{ // this local byteBuffer cap may be smaller than the overall maxSize (like when reading first bytes)
                __CLR4_4_12g32g3lh9yvgfy.R.inc(3224);if ((((read >= remaining)&&(__CLR4_4_12g32g3lh9yvgfy.R.iget(3225)!=0|true))||(__CLR4_4_12g32g3lh9yvgfy.R.iget(3226)==0&false))) {{
                    __CLR4_4_12g32g3lh9yvgfy.R.inc(3227);outStream.write(readBuffer, 0, remaining);
                    __CLR4_4_12g32g3lh9yvgfy.R.inc(3228);break;
                }
                }__CLR4_4_12g32g3lh9yvgfy.R.inc(3229);remaining -= read;
            }
            }__CLR4_4_12g32g3lh9yvgfy.R.inc(3230);outStream.write(readBuffer, 0, read);
        }
        }__CLR4_4_12g32g3lh9yvgfy.R.inc(3231);return ByteBuffer.wrap(outStream.toByteArray());
    }finally{__CLR4_4_12g32g3lh9yvgfy.R.flushNeeded();}}

    @Override
    public void reset() throws IOException {try{__CLR4_4_12g32g3lh9yvgfy.R.inc(3232);
        __CLR4_4_12g32g3lh9yvgfy.R.inc(3233);super.reset();
        __CLR4_4_12g32g3lh9yvgfy.R.inc(3234);remaining = maxSize - markpos;
    }finally{__CLR4_4_12g32g3lh9yvgfy.R.flushNeeded();}}

    public ConstrainableInputStream timeout(long startTimeNanos, long timeoutMillis) {try{__CLR4_4_12g32g3lh9yvgfy.R.inc(3235);
        __CLR4_4_12g32g3lh9yvgfy.R.inc(3236);this.startTime = startTimeNanos;
        __CLR4_4_12g32g3lh9yvgfy.R.inc(3237);this.timeout = timeoutMillis * 1000000;
        __CLR4_4_12g32g3lh9yvgfy.R.inc(3238);return this;
    }finally{__CLR4_4_12g32g3lh9yvgfy.R.flushNeeded();}}

    private boolean expired() {try{__CLR4_4_12g32g3lh9yvgfy.R.inc(3239);
        __CLR4_4_12g32g3lh9yvgfy.R.inc(3240);if ((((timeout == 0)&&(__CLR4_4_12g32g3lh9yvgfy.R.iget(3241)!=0|true))||(__CLR4_4_12g32g3lh9yvgfy.R.iget(3242)==0&false)))
            {__CLR4_4_12g32g3lh9yvgfy.R.inc(3243);return false;

        }__CLR4_4_12g32g3lh9yvgfy.R.inc(3244);final long now = System.nanoTime();
        __CLR4_4_12g32g3lh9yvgfy.R.inc(3245);final long dur = now - startTime;
        __CLR4_4_12g32g3lh9yvgfy.R.inc(3246);return (dur > timeout);
    }finally{__CLR4_4_12g32g3lh9yvgfy.R.flushNeeded();}}
}
