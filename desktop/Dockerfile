FROM java:8
RUN mkdir /app
COPY build/libs/TwoTempate_10006.jar /app
COPY wait-for-it.sh /app
RUN chmod +x /app/wait-for-it.sh
WORKDIR /app
CMD ["java","-jar","TwoTempate_10006.jar"]