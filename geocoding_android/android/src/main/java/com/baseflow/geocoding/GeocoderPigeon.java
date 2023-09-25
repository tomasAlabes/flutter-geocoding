// Autogenerated from Pigeon (v10.0.1), do not edit directly.
// See also: https://pub.dev/packages/pigeon

package com.baseflow.geocoding;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** Generated class from Pigeon. */
@SuppressWarnings({"unused", "unchecked", "CodeBlock2Expr", "RedundantSuppression", "serial"})
public class GeocoderPigeon {

  /** Error class for passing custom error details to Flutter via a thrown PlatformException. */
  public static class FlutterError extends RuntimeException {

    /** The error code. */
    public final String code;

    /** The error details. Must be a datatype supported by the api codec. */
    public final Object details;

    public FlutterError(@NonNull String code, @Nullable String message, @Nullable Object details) 
    {
      super(message);
      this.code = code;
      this.details = details;
    }
  }

  @NonNull
  protected static ArrayList<Object> wrapError(@NonNull Throwable exception) {
    ArrayList<Object> errorList = new ArrayList<Object>(3);
    if (exception instanceof FlutterError) {
      FlutterError error = (FlutterError) exception;
      errorList.add(error.code);
      errorList.add(error.getMessage());
      errorList.add(error.details);
    } else {
      errorList.add(exception.toString());
      errorList.add(exception.getClass().getSimpleName());
      errorList.add(
        "Cause: " + exception.getCause() + ", Stacktrace: " + Log.getStackTraceString(exception));
    }
    return errorList;
  }

  /**
   * A class representing an Address.
   *
   * The address format is a simplified version of xAL (eXtensible Address Language, http://www.oasis-open.org/committees/ciq/ciq.html#6).
   *
   * Generated class from Pigeon that represents data sent in messages.
   */
  public static final class Address {
    /** The address lines associated with the address. */
    private @NonNull List<String> addressLines;

    public @NonNull List<String> getAddressLines() {
      return addressLines;
    }

    public void setAddressLines(@NonNull List<String> setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"addressLines\" is null.");
      }
      this.addressLines = setterArg;
    }

    /** The administrative area associated with the address. */
    private @Nullable String adminArea;

    public @Nullable String getAdminArea() {
      return adminArea;
    }

    public void setAdminArea(@Nullable String setterArg) {
      this.adminArea = setterArg;
    }

    /** The abbreviated country name, according to the two letter (alpha-2) [ISO standard](https://www.iso.org/iso-3166-country-codes.html). */
    private @Nullable String countryCode;

    public @Nullable String getCountryCode() {
      return countryCode;
    }

    public void setCountryCode(@Nullable String setterArg) {
      this.countryCode = setterArg;
    }

    /** The name of the country associated with the address. */
    private @Nullable String countryName;

    public @Nullable String getCountryName() {
      return countryName;
    }

    public void setCountryName(@Nullable String setterArg) {
      this.countryName = setterArg;
    }

    /** The feature name associated with the address. */
    private @Nullable String featureName;

    public @Nullable String getFeatureName() {
      return featureName;
    }

    public void setFeatureName(@Nullable String setterArg) {
      this.featureName = setterArg;
    }

    /** The latitude associated with the address. */
    private @NonNull Double latitude;

    public @NonNull Double getLatitude() {
      return latitude;
    }

    public void setLatitude(@NonNull Double setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"latitude\" is null.");
      }
      this.latitude = setterArg;
    }

    /** The locale associated with the address. */
    private @NonNull String locale;

    public @NonNull String getLocale() {
      return locale;
    }

    public void setLocale(@NonNull String setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"locale\" is null.");
      }
      this.locale = setterArg;
    }

    /** The name of the city associated with the address. */
    private @Nullable String locality;

    public @Nullable String getLocality() {
      return locality;
    }

    public void setLocality(@Nullable String setterArg) {
      this.locality = setterArg;
    }

    /** The longitude associated with the address. */
    private @NonNull Double longitude;

    public @NonNull Double getLongitude() {
      return longitude;
    }

    public void setLongitude(@NonNull Double setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"longitude\" is null.");
      }
      this.longitude = setterArg;
    }

    /** The phone number associated with the address. */
    private @Nullable String phone;

    public @Nullable String getPhone() {
      return phone;
    }

    public void setPhone(@Nullable String setterArg) {
      this.phone = setterArg;
    }

    /** The postal code associated with the address. */
    private @Nullable String postalCode;

    public @Nullable String getPostalCode() {
      return postalCode;
    }

    public void setPostalCode(@Nullable String setterArg) {
      this.postalCode = setterArg;
    }

    /** The premises associated with the address. */
    private @Nullable String premises;

    public @Nullable String getPremises() {
      return premises;
    }

    public void setPremises(@Nullable String setterArg) {
      this.premises = setterArg;
    }

    /** Additional administrative area information for the placemark. */
    private @Nullable String subAdminArea;

    public @Nullable String getSubAdminArea() {
      return subAdminArea;
    }

    public void setSubAdminArea(@Nullable String setterArg) {
      this.subAdminArea = setterArg;
    }

    /** Additional city-level information for the address. */
    private @Nullable String subLocality;

    public @Nullable String getSubLocality() {
      return subLocality;
    }

    public void setSubLocality(@Nullable String setterArg) {
      this.subLocality = setterArg;
    }

    /** Additional street address information for the address. */
    private @Nullable String subThoroughfare;

    public @Nullable String getSubThoroughfare() {
      return subThoroughfare;
    }

    public void setSubThoroughfare(@Nullable String setterArg) {
      this.subThoroughfare = setterArg;
    }

    /** The street address associated with the address. */
    private @Nullable String thoroughfare;

    public @Nullable String getThoroughfare() {
      return thoroughfare;
    }

    public void setThoroughfare(@Nullable String setterArg) {
      this.thoroughfare = setterArg;
    }

    /** The url associated with the address. */
    private @Nullable String url;

    public @Nullable String getUrl() {
      return url;
    }

    public void setUrl(@Nullable String setterArg) {
      this.url = setterArg;
    }

    /** Constructor is non-public to enforce null safety; use Builder. */
    Address() {}

    public static final class Builder {

      private @Nullable List<String> addressLines;

      public @NonNull Builder setAddressLines(@NonNull List<String> setterArg) {
        this.addressLines = setterArg;
        return this;
      }

      private @Nullable String adminArea;

      public @NonNull Builder setAdminArea(@Nullable String setterArg) {
        this.adminArea = setterArg;
        return this;
      }

      private @Nullable String countryCode;

      public @NonNull Builder setCountryCode(@Nullable String setterArg) {
        this.countryCode = setterArg;
        return this;
      }

      private @Nullable String countryName;

      public @NonNull Builder setCountryName(@Nullable String setterArg) {
        this.countryName = setterArg;
        return this;
      }

      private @Nullable String featureName;

      public @NonNull Builder setFeatureName(@Nullable String setterArg) {
        this.featureName = setterArg;
        return this;
      }

      private @Nullable Double latitude;

      public @NonNull Builder setLatitude(@NonNull Double setterArg) {
        this.latitude = setterArg;
        return this;
      }

      private @Nullable String locale;

      public @NonNull Builder setLocale(@NonNull String setterArg) {
        this.locale = setterArg;
        return this;
      }

      private @Nullable String locality;

      public @NonNull Builder setLocality(@Nullable String setterArg) {
        this.locality = setterArg;
        return this;
      }

      private @Nullable Double longitude;

      public @NonNull Builder setLongitude(@NonNull Double setterArg) {
        this.longitude = setterArg;
        return this;
      }

      private @Nullable String phone;

      public @NonNull Builder setPhone(@Nullable String setterArg) {
        this.phone = setterArg;
        return this;
      }

      private @Nullable String postalCode;

      public @NonNull Builder setPostalCode(@Nullable String setterArg) {
        this.postalCode = setterArg;
        return this;
      }

      private @Nullable String premises;

      public @NonNull Builder setPremises(@Nullable String setterArg) {
        this.premises = setterArg;
        return this;
      }

      private @Nullable String subAdminArea;

      public @NonNull Builder setSubAdminArea(@Nullable String setterArg) {
        this.subAdminArea = setterArg;
        return this;
      }

      private @Nullable String subLocality;

      public @NonNull Builder setSubLocality(@Nullable String setterArg) {
        this.subLocality = setterArg;
        return this;
      }

      private @Nullable String subThoroughfare;

      public @NonNull Builder setSubThoroughfare(@Nullable String setterArg) {
        this.subThoroughfare = setterArg;
        return this;
      }

      private @Nullable String thoroughfare;

      public @NonNull Builder setThoroughfare(@Nullable String setterArg) {
        this.thoroughfare = setterArg;
        return this;
      }

      private @Nullable String url;

      public @NonNull Builder setUrl(@Nullable String setterArg) {
        this.url = setterArg;
        return this;
      }

      public @NonNull Address build() {
        Address pigeonReturn = new Address();
        pigeonReturn.setAddressLines(addressLines);
        pigeonReturn.setAdminArea(adminArea);
        pigeonReturn.setCountryCode(countryCode);
        pigeonReturn.setCountryName(countryName);
        pigeonReturn.setFeatureName(featureName);
        pigeonReturn.setLatitude(latitude);
        pigeonReturn.setLocale(locale);
        pigeonReturn.setLocality(locality);
        pigeonReturn.setLongitude(longitude);
        pigeonReturn.setPhone(phone);
        pigeonReturn.setPostalCode(postalCode);
        pigeonReturn.setPremises(premises);
        pigeonReturn.setSubAdminArea(subAdminArea);
        pigeonReturn.setSubLocality(subLocality);
        pigeonReturn.setSubThoroughfare(subThoroughfare);
        pigeonReturn.setThoroughfare(thoroughfare);
        pigeonReturn.setUrl(url);
        return pigeonReturn;
      }
    }

    @NonNull
    ArrayList<Object> toList() {
      ArrayList<Object> toListResult = new ArrayList<Object>(17);
      toListResult.add(addressLines);
      toListResult.add(adminArea);
      toListResult.add(countryCode);
      toListResult.add(countryName);
      toListResult.add(featureName);
      toListResult.add(latitude);
      toListResult.add(locale);
      toListResult.add(locality);
      toListResult.add(longitude);
      toListResult.add(phone);
      toListResult.add(postalCode);
      toListResult.add(premises);
      toListResult.add(subAdminArea);
      toListResult.add(subLocality);
      toListResult.add(subThoroughfare);
      toListResult.add(thoroughfare);
      toListResult.add(url);
      return toListResult;
    }

    static @NonNull Address fromList(@NonNull ArrayList<Object> list) {
      Address pigeonResult = new Address();
      Object addressLines = list.get(0);
      pigeonResult.setAddressLines((List<String>) addressLines);
      Object adminArea = list.get(1);
      pigeonResult.setAdminArea((String) adminArea);
      Object countryCode = list.get(2);
      pigeonResult.setCountryCode((String) countryCode);
      Object countryName = list.get(3);
      pigeonResult.setCountryName((String) countryName);
      Object featureName = list.get(4);
      pigeonResult.setFeatureName((String) featureName);
      Object latitude = list.get(5);
      pigeonResult.setLatitude((Double) latitude);
      Object locale = list.get(6);
      pigeonResult.setLocale((String) locale);
      Object locality = list.get(7);
      pigeonResult.setLocality((String) locality);
      Object longitude = list.get(8);
      pigeonResult.setLongitude((Double) longitude);
      Object phone = list.get(9);
      pigeonResult.setPhone((String) phone);
      Object postalCode = list.get(10);
      pigeonResult.setPostalCode((String) postalCode);
      Object premises = list.get(11);
      pigeonResult.setPremises((String) premises);
      Object subAdminArea = list.get(12);
      pigeonResult.setSubAdminArea((String) subAdminArea);
      Object subLocality = list.get(13);
      pigeonResult.setSubLocality((String) subLocality);
      Object subThoroughfare = list.get(14);
      pigeonResult.setSubThoroughfare((String) subThoroughfare);
      Object thoroughfare = list.get(15);
      pigeonResult.setThoroughfare((String) thoroughfare);
      Object url = list.get(16);
      pigeonResult.setUrl((String) url);
      return pigeonResult;
    }
  }

  /**
   * A class representing a specific geographical, political or cultural region.
   *
   * Generated class from Pigeon that represents data sent in messages.
   */
  public static final class Locale {
    /**
     * The [language] of the current [Locale].
     *
     * The [language] is formatted according to the ISO 639 alpha-2 or alpha-3
     * language code standard, or a language subtag up to 8 characters in
     * length. See the [Android Locale class](https://developer.android.com/reference/java/util/Locale)
     * description about valid language values.
     */
    private @NonNull String language;

    public @NonNull String getLanguage() {
      return language;
    }

    public void setLanguage(@NonNull String setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"language\" is null.");
      }
      this.language = setterArg;
    }

    /**
     * The [country] of the current [Locale].
     *
     * The [country] is formatted according to the ISO 3166 alpha-2 country code
     * or a UN M.49 numeric-3 area code. See the [Android Locale class](https://developer.android.com/reference/java/util/Locale)
     * description about valid language values.
     */
    private @Nullable String country;

    public @Nullable String getCountry() {
      return country;
    }

    public void setCountry(@Nullable String setterArg) {
      this.country = setterArg;
    }

    /**
     * The [variant] of the current [Locale].
     *
     * The [variant] can be any arbitrary value used to indicate a variation of
     * a Locale. See the [Android Locale class](https://developer.android.com/reference/java/util/Locale) description about valid language values.
     */
    private @Nullable String variant;

    public @Nullable String getVariant() {
      return variant;
    }

    public void setVariant(@Nullable String setterArg) {
      this.variant = setterArg;
    }

    /** Constructor is non-public to enforce null safety; use Builder. */
    Locale() {}

    public static final class Builder {

      private @Nullable String language;

      public @NonNull Builder setLanguage(@NonNull String setterArg) {
        this.language = setterArg;
        return this;
      }

      private @Nullable String country;

      public @NonNull Builder setCountry(@Nullable String setterArg) {
        this.country = setterArg;
        return this;
      }

      private @Nullable String variant;

      public @NonNull Builder setVariant(@Nullable String setterArg) {
        this.variant = setterArg;
        return this;
      }

      public @NonNull Locale build() {
        Locale pigeonReturn = new Locale();
        pigeonReturn.setLanguage(language);
        pigeonReturn.setCountry(country);
        pigeonReturn.setVariant(variant);
        return pigeonReturn;
      }
    }

    @NonNull
    ArrayList<Object> toList() {
      ArrayList<Object> toListResult = new ArrayList<Object>(3);
      toListResult.add(language);
      toListResult.add(country);
      toListResult.add(variant);
      return toListResult;
    }

    static @NonNull Locale fromList(@NonNull ArrayList<Object> list) {
      Locale pigeonResult = new Locale();
      Object language = list.get(0);
      pigeonResult.setLanguage((String) language);
      Object country = list.get(1);
      pigeonResult.setCountry((String) country);
      Object variant = list.get(2);
      pigeonResult.setVariant((String) variant);
      return pigeonResult;
    }
  }
  /**
   * Host API for managing the native `InstanceManager`.
   *
   * Generated interface from Pigeon that represents a handler of messages from Flutter.
   */
  public interface InstanceManagerHostApi {
    /**
     * Clear the native `InstanceManager`.
     *
     * This is typically only used after a hot restart.
     */
    void clear();

    /** The codec used by InstanceManagerHostApi. */
    static @NonNull MessageCodec<Object> getCodec() {
      return new StandardMessageCodec();
    }
    /**Sets up an instance of `InstanceManagerHostApi` to handle messages through the `binaryMessenger`. */
    static void setup(@NonNull BinaryMessenger binaryMessenger, @Nullable InstanceManagerHostApi api) {
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger, "dev.flutter.pigeon.InstanceManagerHostApi.clear", getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<Object>();
                try {
                  api.clear();
                  wrapped.add(0, null);
                }
 catch (Throwable exception) {
                  ArrayList<Object> wrappedError = wrapError(exception);
                  wrapped = wrappedError;
                }
                reply.reply(wrapped);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
    }
  }
  /**
   * Handles methods calls to the native Java Object class.
   *
   * Also handles calls to remove the reference to an instance with `dispose`.
   *
   * See https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html.
   *
   * Generated interface from Pigeon that represents a handler of messages from Flutter.
   */
  public interface JavaObjectHostApi {

    void dispose(@NonNull String identifier);

    /** The codec used by JavaObjectHostApi. */
    static @NonNull MessageCodec<Object> getCodec() {
      return new StandardMessageCodec();
    }
    /**Sets up an instance of `JavaObjectHostApi` to handle messages through the `binaryMessenger`. */
    static void setup(@NonNull BinaryMessenger binaryMessenger, @Nullable JavaObjectHostApi api) {
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger, "dev.flutter.pigeon.JavaObjectHostApi.dispose", getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<Object>();
                ArrayList<Object> args = (ArrayList<Object>) message;
                String identifierArg = (String) args.get(0);
                try {
                  api.dispose(identifierArg);
                  wrapped.add(0, null);
                }
 catch (Throwable exception) {
                  ArrayList<Object> wrappedError = wrapError(exception);
                  wrapped = wrappedError;
                }
                reply.reply(wrapped);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
    }
  }
  /**
   * Handles callbacks methods for the native Java Object class.
   *
   * See https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html.
   *
   * Generated class from Pigeon that represents Flutter messages that can be called from Java.
   */
  public static class JavaObjectFlutterApi {
    private final @NonNull BinaryMessenger binaryMessenger;

    public JavaObjectFlutterApi(@NonNull BinaryMessenger argBinaryMessenger) {
      this.binaryMessenger = argBinaryMessenger;
    }

    /** Public interface for sending reply. */ 
    @SuppressWarnings("UnknownNullness")
    public interface Reply<T> {
      void reply(T reply);
    }
    /** The codec used by JavaObjectFlutterApi. */
    static @NonNull MessageCodec<Object> getCodec() {
      return new StandardMessageCodec();
    }
    public void dispose(@NonNull String identifierArg, @NonNull Reply<Void> callback) {
      BasicMessageChannel<Object> channel =
          new BasicMessageChannel<>(
              binaryMessenger, "dev.flutter.pigeon.JavaObjectFlutterApi.dispose", getCodec());
      channel.send(
          new ArrayList<Object>(Collections.singletonList(identifierArg)),
          channelReply -> callback.reply(null));
    }
  }

  private static class GeocoderHostApiCodec extends StandardMessageCodec {
    public static final GeocoderHostApiCodec INSTANCE = new GeocoderHostApiCodec();

    private GeocoderHostApiCodec() {}

    @Override
    protected Object readValueOfType(byte type, @NonNull ByteBuffer buffer) {
      switch (type) {
        case (byte) 128:
          return Locale.fromList((ArrayList<Object>) readValue(buffer));
        default:
          return super.readValueOfType(type, buffer);
      }
    }

    @Override
    protected void writeValue(@NonNull ByteArrayOutputStream stream, Object value) {
      if (value instanceof Locale) {
        stream.write(128);
        writeValue(stream, ((Locale) value).toList());
      } else {
        super.writeValue(stream, value);
      }
    }
  }

  /**
   * Host API for `Geocoding`.
   *
   * This class may handle instantiating and adding native object instances that
   * are attached to a Dart instance or handle method calls on the associated
   * native class or an instance of the class.
   *
   * Generated interface from Pigeon that represents a handler of messages from Flutter.
   */
  public interface GeocoderHostApi {
    /** Creates a new native instance and adds it to the `InstanceManager`. */
    void create(@NonNull String instanceId, @NonNull Locale locale);
    /**
     * Request a list of [Address]es that attempt to describe the surroundings
     * of the provided [latitude] and [longitude].
     *
     * The [maxResults] indicates the max number of [Address]es to be returned.
     * Smaller numbers (1 to 5) are recommended.
     *
     * The [geocodeListenerInstanceId] refers to the [GeocodeListenerFlutterApi]
     * instance that should be used to receive the results.
     */
    void getFromLocation(@NonNull String instanceId, @NonNull Double latitude, @NonNull Double longitude, @NonNull Long maxResults, @NonNull String geocodeListenerInstanceId);
    /**
     * Requests an array of [Address]es that attempt to describe the named
     * [address].
     *
     * The [address] may be a place name such as "Dalvik, Iceland", an address
     * such as "1600 Amphitheatre Parkway, Mountain View, CA", an airport code
     * such as "SFO", and so forth. The resulting addresses should be localized
     * for the locale provided to this class's constructor.
     *
     * The [geocodeListenerInstanceId] refers to the [GeocodeListenerFlutterApi]
     * instance that should be used to receive the results.
     *
     * You may specify a bounding box for the search results by including the
     * latitude and longitude of the lower left point and upper right point of
     * the box.
     */
    void getFromLocationName(@NonNull String instanceId, @NonNull String address, @NonNull String geocodeListenerInstanceId, @Nullable Long maxResults, @Nullable Double lowerLeftLatitude, @Nullable Double lowerLeftLongitude, @Nullable Double upperRightLatitude, @Nullable Double upperRightLongitude);
    /**
     * Indicates if a geocoder implementation is present that may return results.
     *
     * If `true`, there is still no guarantee that any individual geocoding
     * attempt will succeed.
     */
    @NonNull 
    Boolean isPresent();

    /** The codec used by GeocoderHostApi. */
    static @NonNull MessageCodec<Object> getCodec() {
      return GeocoderHostApiCodec.INSTANCE;
    }
    /**Sets up an instance of `GeocoderHostApi` to handle messages through the `binaryMessenger`. */
    static void setup(@NonNull BinaryMessenger binaryMessenger, @Nullable GeocoderHostApi api) {
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger, "dev.flutter.pigeon.GeocoderHostApi.create", getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<Object>();
                ArrayList<Object> args = (ArrayList<Object>) message;
                String instanceIdArg = (String) args.get(0);
                Locale localeArg = (Locale) args.get(1);
                try {
                  api.create(instanceIdArg, localeArg);
                  wrapped.add(0, null);
                }
 catch (Throwable exception) {
                  ArrayList<Object> wrappedError = wrapError(exception);
                  wrapped = wrappedError;
                }
                reply.reply(wrapped);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger, "dev.flutter.pigeon.GeocoderHostApi.getFromLocation", getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<Object>();
                ArrayList<Object> args = (ArrayList<Object>) message;
                String instanceIdArg = (String) args.get(0);
                Double latitudeArg = (Double) args.get(1);
                Double longitudeArg = (Double) args.get(2);
                Number maxResultsArg = (Number) args.get(3);
                String geocodeListenerInstanceIdArg = (String) args.get(4);
                try {
                  api.getFromLocation(instanceIdArg, latitudeArg, longitudeArg, (maxResultsArg == null) ? null : maxResultsArg.longValue(), geocodeListenerInstanceIdArg);
                  wrapped.add(0, null);
                }
 catch (Throwable exception) {
                  ArrayList<Object> wrappedError = wrapError(exception);
                  wrapped = wrappedError;
                }
                reply.reply(wrapped);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger, "dev.flutter.pigeon.GeocoderHostApi.getFromLocationName", getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<Object>();
                ArrayList<Object> args = (ArrayList<Object>) message;
                String instanceIdArg = (String) args.get(0);
                String addressArg = (String) args.get(1);
                String geocodeListenerInstanceIdArg = (String) args.get(2);
                Number maxResultsArg = (Number) args.get(3);
                Double lowerLeftLatitudeArg = (Double) args.get(4);
                Double lowerLeftLongitudeArg = (Double) args.get(5);
                Double upperRightLatitudeArg = (Double) args.get(6);
                Double upperRightLongitudeArg = (Double) args.get(7);
                try {
                  api.getFromLocationName(instanceIdArg, addressArg, geocodeListenerInstanceIdArg, (maxResultsArg == null) ? null : maxResultsArg.longValue(), lowerLeftLatitudeArg, lowerLeftLongitudeArg, upperRightLatitudeArg, upperRightLongitudeArg);
                  wrapped.add(0, null);
                }
 catch (Throwable exception) {
                  ArrayList<Object> wrappedError = wrapError(exception);
                  wrapped = wrappedError;
                }
                reply.reply(wrapped);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger, "dev.flutter.pigeon.GeocoderHostApi.isPresent", getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<Object>();
                try {
                  Boolean output = api.isPresent();
                  wrapped.add(0, output);
                }
 catch (Throwable exception) {
                  ArrayList<Object> wrappedError = wrapError(exception);
                  wrapped = wrappedError;
                }
                reply.reply(wrapped);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
    }
  }
  /** Generated interface from Pigeon that represents a handler of messages from Flutter. */
  public interface GeocodeListenerHostApi {

    void create(@NonNull String instanceId);

    /** The codec used by GeocodeListenerHostApi. */
    static @NonNull MessageCodec<Object> getCodec() {
      return new StandardMessageCodec();
    }
    /**Sets up an instance of `GeocodeListenerHostApi` to handle messages through the `binaryMessenger`. */
    static void setup(@NonNull BinaryMessenger binaryMessenger, @Nullable GeocodeListenerHostApi api) {
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger, "dev.flutter.pigeon.GeocodeListenerHostApi.create", getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<Object>();
                ArrayList<Object> args = (ArrayList<Object>) message;
                String instanceIdArg = (String) args.get(0);
                try {
                  api.create(instanceIdArg);
                  wrapped.add(0, null);
                }
 catch (Throwable exception) {
                  ArrayList<Object> wrappedError = wrapError(exception);
                  wrapped = wrappedError;
                }
                reply.reply(wrapped);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
    }
  }

  private static class GeocodeListenerFlutterApiCodec extends StandardMessageCodec {
    public static final GeocodeListenerFlutterApiCodec INSTANCE = new GeocodeListenerFlutterApiCodec();

    private GeocodeListenerFlutterApiCodec() {}

    @Override
    protected Object readValueOfType(byte type, @NonNull ByteBuffer buffer) {
      switch (type) {
        case (byte) 128:
          return Address.fromList((ArrayList<Object>) readValue(buffer));
        default:
          return super.readValueOfType(type, buffer);
      }
    }

    @Override
    protected void writeValue(@NonNull ByteArrayOutputStream stream, Object value) {
      if (value instanceof Address) {
        stream.write(128);
        writeValue(stream, ((Address) value).toList());
      } else {
        super.writeValue(stream, value);
      }
    }
  }

  /** Generated class from Pigeon that represents Flutter messages that can be called from Java. */
  public static class GeocodeListenerFlutterApi {
    private final @NonNull BinaryMessenger binaryMessenger;

    public GeocodeListenerFlutterApi(@NonNull BinaryMessenger argBinaryMessenger) {
      this.binaryMessenger = argBinaryMessenger;
    }

    /** Public interface for sending reply. */ 
    @SuppressWarnings("UnknownNullness")
    public interface Reply<T> {
      void reply(T reply);
    }
    /** The codec used by GeocodeListenerFlutterApi. */
    static @NonNull MessageCodec<Object> getCodec() {
      return GeocodeListenerFlutterApiCodec.INSTANCE;
    }
    public void onError(@NonNull String instanceIdArg, @NonNull String errorMessageArg, @NonNull Reply<Void> callback) {
      BasicMessageChannel<Object> channel =
          new BasicMessageChannel<>(
              binaryMessenger, "dev.flutter.pigeon.GeocodeListenerFlutterApi.onError", getCodec());
      channel.send(
          new ArrayList<Object>(Arrays.asList(instanceIdArg, errorMessageArg)),
          channelReply -> callback.reply(null));
    }
    public void onGeocode(@NonNull String instanceIdArg, @NonNull List<Address> addressesArg, @NonNull Reply<Void> callback) {
      BasicMessageChannel<Object> channel =
          new BasicMessageChannel<>(
              binaryMessenger, "dev.flutter.pigeon.GeocodeListenerFlutterApi.onGeocode", getCodec());
      channel.send(
          new ArrayList<Object>(Arrays.asList(instanceIdArg, addressesArg)),
          channelReply -> callback.reply(null));
    }
  }
}
